package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b7i0 {
    public final osm0 a;
    public final utm0 b;
    public final zau0 c;
    public final bpb1 d;
    public vm70 e;
    public boolean f;
    public final jge g;
    public String h;
    public String i;
    public boolean j;

    public b7i0(msm0 msm0Var) {
        osm0 osm0VarA = msm0Var.a(new ez3((byte) 1));
        this.a = osm0VarA;
        utm0 utm0VarB = osm0VarA.b(new esm0("media-trimmer-player", lxf0.e1), 1);
        this.b = utm0VarB;
        this.c = utm0VarB.c(false);
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.d = bpb1VarB;
        this.g = hu20.e(bpb1VarB, new i64(3, (lnm) null, (byte) 14));
        this.h = "";
        this.i = "";
    }

    public final void a(vm70 vm70Var) {
        this.e = vm70Var;
        r091 r091Var = (r091) this.d.getValue();
        if (r091Var == null) {
            return;
        }
        bpb1 bpb1Var = r091Var.g;
        r091Var.i(vm70Var);
        if (vm70Var == null || !(((i091) bpb1Var.getValue()).h instanceof m091)) {
            return;
        }
        r091Var.h(((i091) bpb1Var.getValue()).d);
    }

    public final lsm0 b(long j, long j2) {
        String str = this.h;
        gec1 gec1Var = new gec1("7d4e9f1a2c8b46f3a91d5e0c7b3a8f62");
        String str2 = this.i;
        return new lsm0(str, new ksm0(gec1Var, str2, null, "media-trimmer-player", str2, null, 484), this.j, false, new jsm0(Long.valueOf(j), Long.valueOf(j2)), 0L, (ism0) null, "mediatrimmer-preview", false, 0, 1896);
    }

    public final void c(long j, long j2, String str, String str2, boolean z) {
        r091 r091Var;
        vm70 vm70Var;
        this.h = str;
        this.i = str2;
        this.j = z;
        utm0 utm0Var = this.b;
        zau0 zau0Var = this.c;
        utm0Var.a(zau0Var);
        bpb1 bpb1Var = this.d;
        r091 r091Var2 = (r091) bpb1Var.getValue();
        r091 r091VarR = q3p1.r(zau0Var, r091Var2);
        if (r091VarR != null) {
            r091VarR.k();
            r091VarR.b(b(j, j2));
            r091Var = r091VarR;
        } else {
            r091Var = null;
        }
        bpb1Var.l(r091Var);
        this.f = r091VarR != null;
        if (r091VarR == null || r091VarR == r091Var2 || (vm70Var = this.e) == null) {
            return;
        }
        a(vm70Var);
    }

    public final void d(yjp1 yjp1Var) {
        r091 r091Var;
        if (!this.f || (r091Var = (r091) this.d.getValue()) == null) {
            return;
        }
        r091.f(r091Var, (tv80) null, (Long) null, yjp1Var, 7);
    }
}
