package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class omd1 {
    public final boolean A;
    public final evn B;
    public final vb2 C;
    public final n6r0 D;
    public final y441 E;
    public final boolean F;
    public final q8n G;
    public final q8n H;
    public final q8n I;
    public final boolean J;
    public final boolean K;
    public final yzu L;
    public final lik1 M;
    public final boolean N;
    public final boolean O;
    public final ro30 P;
    public final Context a;
    public final o241 b;
    public final rsz0 c;
    public final boolean d;
    public final brz0 e;
    public final rk11 f;
    public final q8x g;
    public final d0r h;
    public final yqg i;
    public final d771 j;
    public final tzr0 k;
    public final tzo l;
    public final ycm m;
    public final map n;
    public final paz o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yyo f29p;
    public final fap q;
    public final drp0 r;
    public final xyo s;
    public final vyo t;
    public final uxy0 u;
    public final x4e v;
    public final s7p w;
    public final lls0 x;
    public final msn y;
    public final boolean z;

    public omd1(Context context, o241 o241Var, rsz0 rsz0Var, boolean z, brz0 brz0Var, rk11 rk11Var, q8x q8xVar, d0r d0rVar, yqg yqgVar, String str, d771 d771Var, tzr0 tzr0Var, tzo tzoVar, ycm ycmVar, map mapVar, paz pazVar, yyo yyoVar, fap fapVar, drp0 drp0Var, xyo xyoVar, vyo vyoVar, uxy0 uxy0Var, x4e x4eVar, s7p s7pVar, lls0 lls0Var, msn msnVar, boolean z2, boolean z3, evn evnVar, vb2 vb2Var, n6r0 n6r0Var, y441 y441Var, boolean z4, boolean z5, q8n q8nVar, q8n q8nVar2, q8n q8nVar3, boolean z6, boolean z7, yzu yzuVar, lik1 lik1Var, boolean z8, boolean z9, ro30 ro30Var) {
        this.a = context;
        this.b = o241Var;
        this.c = rsz0Var;
        this.d = z;
        this.e = brz0Var;
        this.f = rk11Var;
        this.g = q8xVar;
        this.h = d0rVar;
        this.i = yqgVar;
        this.j = d771Var;
        this.k = tzr0Var;
        this.l = tzoVar;
        this.m = ycmVar;
        this.n = mapVar;
        this.o = pazVar;
        this.f29p = yyoVar;
        this.q = fapVar;
        this.r = drp0Var;
        this.s = xyoVar;
        this.t = vyoVar;
        this.u = uxy0Var;
        this.v = x4eVar;
        this.w = s7pVar;
        this.x = lls0Var;
        this.y = msnVar;
        this.z = z2;
        this.A = z3;
        this.B = evnVar;
        this.C = vb2Var;
        this.D = n6r0Var;
        this.E = y441Var;
        this.F = z4;
        this.G = q8nVar;
        this.H = q8nVar2;
        this.I = q8nVar3;
        this.J = z6;
        this.K = z7;
        this.L = yzuVar;
        this.M = lik1Var;
        this.N = z8;
        this.O = z9;
        this.P = ro30Var;
    }

    public static List a(glm0 glm0Var, boolean z) {
        boolean z2 = glm0Var instanceof elm0;
        List listSingletonList = z6x.a;
        if (!z2) {
            if (glm0Var instanceof dlm0) {
                gld1 gld1Var = new gld1();
                return Collections.singletonList(new h8k1(gld1Var, gld1Var));
            }
            if (u890.j(glm0Var, flm0.a)) {
                return listSingletonList;
            }
            eg.o();
            return null;
        }
        ArrayList<zkm0> arrayList = ((elm0) glm0Var).a;
        if (arrayList.isEmpty()) {
            jld1 jld1Var = new jld1();
            return Collections.singletonList(new h8k1(jld1Var, jld1Var));
        }
        if (z) {
            kld1 kld1Var = kld1.a;
            listSingletonList = Collections.singletonList(new h8k1(kld1Var, kld1Var));
        }
        List list = listSingletonList;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (zkm0 zkm0Var : arrayList) {
            lld1 lld1Var = new lld1(zkm0Var.a, zkm0Var.b);
            arrayList2.add(new h8k1(lld1Var, lld1Var));
        }
        return o7h.N0(arrayList2, list);
    }
}
