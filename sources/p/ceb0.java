package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class ceb0 implements Update {
    public static final ceb0 a = new ceb0();

    public final Next a(Object obj, Object obj2) {
        eeb0 eeb0Var = (eeb0) obj;
        aeb0 aeb0Var = (aeb0) obj2;
        beb0 beb0Var = eeb0Var.a;
        adb0 adb0Var = eeb0Var.b;
        if (aeb0Var instanceof xdb0) {
            String str = ((xdb0) aeb0Var).a;
            return str.equals(adb0Var.a()) ? Next.j() : Next.i(new eeb0(beb0Var, new zcb0(adb0Var.a(), str)), Collections.singleton(new vdb0(str)));
        }
        if (aeb0Var.equals(zdb0.a)) {
            zcb0 zcb0Var = adb0Var instanceof zcb0 ? (zcb0) adb0Var : null;
            return zcb0Var != null ? Next.i(new eeb0(beb0Var, new xcb0(zcb0Var.b)), Collections.singleton(udb0.a)) : Next.j();
        }
        if (aeb0Var.equals(ydb0.a)) {
            zcb0 zcb0Var2 = adb0Var instanceof zcb0 ? (zcb0) adb0Var : null;
            return zcb0Var2 != null ? Next.h(new eeb0(beb0Var, new ycb0(zcb0Var2.a, zcb0Var2.b))) : Next.j();
        }
        if (aeb0Var.equals(wdb0.a)) {
            ycb0 ycb0Var = adb0Var instanceof ycb0 ? (ycb0) adb0Var : null;
            return ycb0Var != null ? Next.h(new eeb0(beb0Var, new xcb0(ycb0Var.a))) : Next.j();
        }
        eg.o();
        return null;
    }
}
