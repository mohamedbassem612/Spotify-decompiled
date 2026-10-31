package p;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class f1d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p1d b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ f1d(p1d p1dVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = p1dVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cab cabVar;
        switch (this.a) {
            case 0:
                p1d p1dVar = this.b;
                ArrayList<iy8> arrayList = this.c;
                ArrayList arrayList2 = new ArrayList();
                boolean z = false;
                boolean z2 = false;
                for (iy8 iy8Var : arrayList) {
                    if (p1dVar.a.t(iy8Var.a)) {
                        ((LinkedHashMap) p1dVar.a.b).remove(iy8Var.a);
                        arrayList2.add(iy8Var.a);
                        if (iy8Var.b == law0.class) {
                            z2 = true;
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                p1dVar.t("Use cases [" + TextUtils.join(", ", arrayList2) + "] now DETACHED for camera");
                if (z2) {
                    p1dVar.g.h.getClass();
                }
                p1dVar.p();
                if (p1dVar.a.s().isEmpty()) {
                    p1dVar.g.l.a = false;
                } else {
                    p1dVar.L();
                }
                if (!p1dVar.a.r().isEmpty()) {
                    p1dVar.K();
                    p1dVar.D();
                    if (p1dVar.h1 == 9) {
                        p1dVar.B();
                        return;
                    }
                    return;
                }
                p1dVar.g.i();
                p1dVar.D();
                p1dVar.g.m(false);
                p1dVar.Y = p1dVar.z();
                p1dVar.t("Closing camera.");
                switch (l1d.C(p1dVar.h1)) {
                    case 3:
                        o0c.q((String) null, p1dVar.t == null);
                        p1dVar.F(3);
                        return;
                    case 4:
                    default:
                        p1dVar.t("close() ignored due to being in state: ".concat(z5c.u(p1dVar.h1)));
                        return;
                    case 5:
                    case 6:
                    case 7:
                        if (p1dVar.h.a() || ((cabVar = (cab) p1dVar.g1.b) != null && !((AtomicBoolean) cabVar.c).get())) {
                            z = true;
                        }
                        p1dVar.g1.h();
                        p1dVar.F(5);
                        if (z) {
                            o0c.q((String) null, p1dVar.Z.isEmpty());
                            p1dVar.r();
                            return;
                        }
                        return;
                    case 8:
                    case 9:
                        p1dVar.F(5);
                        p1dVar.q();
                        return;
                }
            default:
                p1d p1dVar2 = this.b;
                ArrayList arrayList3 = this.c;
                d1d d1dVar = p1dVar2.g;
                try {
                    p1dVar2.H(arrayList3);
                    return;
                } finally {
                    d1dVar.i();
                }
        }
    }
}
