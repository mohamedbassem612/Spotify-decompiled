package p;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ph41 implements ci90 {
    public final /* synthetic */ byte a;
    public final tdl0 b;
    public final Object c;

    public /* synthetic */ ph41(Object obj, tdl0 tdl0Var, byte b) {
        this.a = b;
        this.c = obj;
        this.b = tdl0Var;
    }

    public final String a() {
        switch (this.a) {
            case 0:
                return "playlist_collaboration_scannable";
            default:
                return "playlist_collaboration_view_profile";
        }
    }

    public final b0o1 b() {
        switch (this.a) {
            case 0:
                return zgm.c;
            default:
                return ahm.c;
        }
    }

    public final void c(vpu0 vpu0Var, tv80 tv80Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                List list = vpu0Var.b.f;
                if (!list.isEmpty()) {
                    ((oh41) obj).a(((fji0) list.get(0)).a.a).i.d.invoke(tv80Var);
                } else {
                    hhg1.n("Missing member in members list.");
                }
                break;
            default:
                List list2 = vpu0Var.b.f;
                if (!list2.isEmpty()) {
                    ((lzn0) obj).a(((fji0) list2.get(0)).a.a, tv80Var, (Bundle) null);
                } else {
                    hhg1.n("Missing member in members list.");
                }
                break;
        }
    }

    public final ghm e(vpu0 vpu0Var) {
        switch (this.a) {
            case 0:
                List list = vpu0Var.b.f;
                if (!list.isEmpty()) {
                    return new ghm(new v721(this, vpu0Var, ((fji0) list.get(0)).a.a, (byte) 21), o641.c1);
                }
                hhg1.n("Missing member in members list.");
                return null;
            default:
                List list2 = vpu0Var.b.f;
                if (list2.isEmpty()) {
                    hhg1.n("Missing member in members list.");
                    return null;
                }
                String str = ((fji0) list2.get(0)).a.a;
                return new ghm(new jyi1(this, vpu0Var, str, (byte) 8), new bek1(str, (byte) 0));
        }
    }

    public final int f(vpu0 vpu0Var) {
        switch (this.a) {
            case 0:
                return 2131960100;
            default:
                return 2131960103;
        }
    }

    public final hux g(vpu0 vpu0Var) {
        switch (this.a) {
            case 0:
                return atx.c;
            default:
                return ttx.c;
        }
    }

    public final boolean h(vpu0 vpu0Var) {
        switch (this.a) {
        }
        return true;
    }
}
