package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class gli0 implements Update {
    public static final gli0 a = new gli0();

    public final Next a(Object obj, Object obj2) {
        fli0 fli0Var = (fli0) obj;
        eli0 eli0Var = (eli0) obj2;
        String str = fli0Var.a;
        dx dxVar = fli0Var.e;
        if (eli0Var instanceof xki0) {
            boolean z = ((xki0) eli0Var).a;
            if (dxVar instanceof cx) {
                return Next.i(fli0.a(fli0Var, cx.a((cx) dxVar, z), 0, 239), Collections.singleton(new oki0(str, z)));
            }
            if (dxVar instanceof bx) {
                return Next.i(fli0.a(fli0Var, bx.a((bx) dxVar, z, false, false, 123), 0, 239), Collections.singleton(new mki0(str, z)));
            }
            if (dxVar instanceof ax) {
                n57.e("onExplicitContentToggleClicked is not supported for legacy managed accounts.");
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (eli0Var instanceof wki0) {
            boolean z2 = ((wki0) eli0Var).a;
            if (dxVar instanceof cx) {
                return Next.h(fli0.a(fli0Var, cx.a((cx) dxVar, z2), 0, 239));
            }
            if (dxVar instanceof bx) {
                return Next.h(fli0.a(fli0Var, bx.a((bx) dxVar, z2, false, false, 123), 0, 239));
            }
            if (dxVar instanceof ax) {
                n57.e("onExplicitContentToggleChanged is not supported for legacy managed accounts.");
                return Next.j();
            }
            eg.o();
            return null;
        }
        boolean z3 = eli0Var instanceof yki0;
        kki0 kki0Var = kki0.b;
        if (z3) {
            boolean z4 = ((yki0) eli0Var).a;
            if (dxVar instanceof cx) {
                return Next.i(fli0.a(fli0Var, cx.a((cx) dxVar, z4), 0, 239), Collections.singleton(kki0Var));
            }
            if (dxVar instanceof bx) {
                return Next.i(fli0.a(fli0Var, bx.a((bx) dxVar, z4, false, false, 123), 0, 239), Collections.singleton(kki0Var));
            }
            if (dxVar instanceof ax) {
                n57.e("onExplicitContentToggleFailed is not supported for legacy managed accounts.");
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (eli0Var instanceof cli0) {
            boolean z5 = ((cli0) eli0Var).a;
            if (dxVar instanceof cx) {
                n57.e("onVideoContentToggleClicked is not supported for self managed accounts.");
                return Next.j();
            }
            if (dxVar instanceof bx) {
                return Next.i(fli0.a(fli0Var, bx.a((bx) dxVar, false, z5, false, 119), 0, 239), Collections.singleton(new nki0(str, z5)));
            }
            if (dxVar instanceof ax) {
                n57.e("onVideoContentToggleClicked is not supported for legacy managed accounts.");
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (eli0Var instanceof bli0) {
            bli0 bli0Var = (bli0) eli0Var;
            if (dxVar instanceof cx) {
                n57.e("onVideoContentToggleChanged is not supported for self managed accounts.");
                return Next.j();
            }
            if (dxVar instanceof bx) {
                return Next.h(fli0.a(fli0Var, bx.a((bx) dxVar, false, bli0Var.a, false, 119), 0, 239));
            }
            if (dxVar instanceof ax) {
                n57.e("onVideoContentToggleChanged is not supported for legacy managed accounts.");
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (eli0Var instanceof dli0) {
            dli0 dli0Var = (dli0) eli0Var;
            if (dxVar instanceof cx) {
                n57.e("onExplicitContentToggleFailed is not supported for self managed accounts.");
                return Next.j();
            }
            if (dxVar instanceof bx) {
                return Next.i(fli0.a(fli0Var, bx.a((bx) dxVar, false, dli0Var.a, false, 119), 0, 239), Collections.singleton(kki0Var));
            }
            if (dxVar instanceof ax) {
                n57.e("onExplicitContentToggleFailed is not supported for legacy managed accounts.");
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (eli0Var instanceof uki0) {
            boolean z6 = ((uki0) eli0Var).a;
            if (dxVar instanceof cx) {
                n57.e("onConnectToggleClicked is not supported for self managed accounts.");
                return Next.j();
            }
            if (dxVar instanceof bx) {
                return Next.i(fli0.a(fli0Var, bx.a((bx) dxVar, false, false, z6, 95), 0, 239), Collections.singleton(new lki0(str, z6)));
            }
            if (dxVar instanceof ax) {
                n57.e("onConnectToggleClicked is not supported for legacy managed accounts.");
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (eli0Var instanceof tki0) {
            tki0 tki0Var = (tki0) eli0Var;
            if (dxVar instanceof cx) {
                n57.e("onConnectToggleChanged is not supported for self managed accounts.");
                return Next.j();
            }
            if (dxVar instanceof bx) {
                return Next.h(fli0.a(fli0Var, bx.a((bx) dxVar, false, false, tki0Var.a, 95), 0, 239));
            }
            if (dxVar instanceof ax) {
                n57.e("onConnectToggleChanged is not supported for legacy managed accounts.");
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (eli0Var instanceof vki0) {
            vki0 vki0Var = (vki0) eli0Var;
            if (dxVar instanceof cx) {
                n57.e("onConnectToggleFailed is not supported for self managed accounts.");
                return Next.j();
            }
            if (dxVar instanceof bx) {
                return Next.i(fli0.a(fli0Var, bx.a((bx) dxVar, false, false, vki0Var.a, 95), 0, 239), Collections.singleton(kki0Var));
            }
            if (dxVar instanceof ax) {
                n57.e("onConnectToggleFailed is not supported for legacy managed accounts.");
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (eli0Var.equals(zki0.a)) {
            return Next.h(fli0.a(fli0Var, null, 2, 223));
        }
        if (eli0Var.equals(zki0.c)) {
            return Next.h(fli0.a(fli0Var, null, 1, 223));
        }
        if (eli0Var instanceof ski0) {
            return ((dxVar instanceof cx) && ((cx) dxVar).d) ? Next.i(fli0.a(fli0Var, null, 1, 223), Collections.singleton(new jki0(str))) : Next.j();
        }
        if (eli0Var.equals(zki0.b)) {
            return Next.a(Collections.singleton(iki0.b));
        }
        if (eli0Var instanceof ali0) {
            return Next.h(((ali0) eli0Var).a);
        }
        eg.o();
        return null;
    }
}
