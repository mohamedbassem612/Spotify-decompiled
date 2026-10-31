package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class hia0 {
    public static final /* synthetic */ mma0[] a = {new een0(hia0.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmClass;)Z", 1), new een0(hia0.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmConstructor;)Z", 1), new een0(hia0.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmFunction;)Z", 1), new een0(hia0.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmProperty;)Z", 1), new een0(hia0.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new een0(hia0.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmValueParameter;)Z", 1), new een0(hia0.class, "isMovedFromInterfaceCompanion", "isMovedFromInterfaceCompanion(Lkotlin/metadata/KmProperty;)Z", 1), new een0(hia0.class, "hasMethodBodiesInInterface", "getHasMethodBodiesInInterface(Lkotlin/metadata/KmClass;)Z", 1), new een0(hia0.class, "isCompiledInCompatibilityMode", "isCompiledInCompatibilityMode(Lkotlin/metadata/KmClass;)Z", 1)};
    public static final mgc b;

    static {
        lo20 lo20Var = no20.c;
        u2p1.i(new go20(lo20Var, 1));
        go20 go20Var = new go20(lo20Var, 1);
        int i = ao20.b;
        if (go20Var.b != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var, " was passed");
            return;
        }
        u2p1.j(new go20(lo20Var, 1));
        u2p1.q(new go20(lo20Var, 1));
        go20 go20Var2 = new go20(lo20Var, 1);
        co20 co20Var = co20.b;
        if (go20Var2.b != 1 || go20Var2.c != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var2, " was passed");
            return;
        }
        go20 go20Var3 = new go20(lo20Var, 1);
        fo20 fo20Var = fo20.b;
        if (go20Var3.b != 1 || go20Var3.c != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var3, " was passed");
            return;
        }
        gia0 gia0Var = gia0.b;
        lo20 lo20Var2 = xia0.a;
        b = new mgc(gia0Var, new go20(lo20Var2.a, lo20Var2.b, 1));
        int i2 = fm7.d;
        lo20 lo20Var3 = xia0.b;
        int i3 = lo20Var3.a;
        int i4 = lo20Var3.b;
        go20 go20Var4 = new go20(i3, i4, 1);
        if (i4 != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var4, " was passed");
            return;
        }
        int i5 = fm7.d;
        lo20 lo20Var4 = xia0.c;
        int i6 = lo20Var4.a;
        int i7 = lo20Var4.b;
        go20 go20Var5 = new go20(i6, i7, 1);
        if (i7 == 1) {
            return;
        }
        bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var5, " was passed");
    }
}
