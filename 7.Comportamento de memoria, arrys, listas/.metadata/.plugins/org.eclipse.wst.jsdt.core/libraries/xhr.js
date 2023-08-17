lls.TypeInferer.GetInferedType(System.Type,System.Type,System.Type,System.Type,System.Collections.Generic.Dictionary{System.Type,System.Type})">
            <summary>
            Provides generic type inference for a single parameter.
            </summary>
            <remarks>
            For example: 
              M{T}(T x)
              M{T}(IList{T} x)
              M{T}(ref T x)
              M{T}(T[] x)
              M{T}(ref Dictionary{T,T}[] x)
            </remarks>
        </member>
        <member name="M:Microsoft.Scripting.Actions.Calls.TypeInferer.ConstraintsViolated(System.Type,System.Type,System.Collections.Generic.Dictionary{System.Type,System.Type})">
            <summary>
            Checks if the constraints are violated by the given input for the specified generic method parameter.
            
            This method must be supplied with a mapping for any dependent generic method type parameters which
            this one can be constrained to.  For example for the signature "void Foo{T0, T1}(T0 x, T1 y) where T0 : T1".
            we cannot know if the constraints are violated unless we know what we have calculated T1 to be.
            </summary>
        </member>
        <member name="M:Microsoft.Scripting.Actions.Calls.TypeInferer.MatchGenericParameter(System.Type,System.Type,System.Type,System.Collections.Generic.Dictionary{System.Type,System.Type},System.Type@)">
            <summary>
            Finds all occurences of <c>genericParameter</c> in <c>openType</c> and the corresponding concrete types in <c>closedType</c>.
            Returns true iff all occurences of the generic parameter in the open type correspond to the same concrete type in the closed type 
            and this type satisfies given <c>constraints</c>. Returns the concrete type in <c>match</c> if so.
            </summary>
        </member>
        <member name="T:Microsoft.Scripting.Actions.Calls.IInferableInvokable">
            <summary>
            Implemented by DynamicMetaObject subclasses when the associated object
            can participate in generic method type inference.  This interface
            is used when the inference engine is attempting to perform type inference
            for a parameter which is typed to a delegate type.
            </summary>
        </member>
        <member name="M:Microsoft.Scripting.Actions.Calls.IInferableInvokable.GetInferredType(System.Type,System.Type)">
            <summary>
            Returns the type inferred for parameterType when performing
            inference for a conversion to delegateType.
            </summary>
        </member>
        <member name="T:Microsoft.Scripting.Actions.Calls.InferenceResult">
            <summary>
          