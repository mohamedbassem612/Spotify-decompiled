package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kz00 extends k9 {
    public final hyc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz00(hyc hycVar, a8b0 a8b0Var) {
        super(a8b0Var);
        if (hycVar == null) {
            r0(0);
            throw null;
        }
        if (a8b0Var == null) {
            r0(1);
            throw null;
        }
        this.c = hycVar;
    }

    public static /* synthetic */ void r0(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public final String toString() {
        return getType() + ": Ext {" + this.c + "}";
    }
}
