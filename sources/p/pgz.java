package p;

import com.spotify.messages.UbiExpr1ErrorDetection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pgz implements wwn0 {
    public final b6h1 a;
    public final t2j0 b;
    public final yqg c;
    public final s8h1 d;
    public final dl3 e;
    public final Function0 f;
    public nsn0 g;
    public final fj00 h;
    public final fj00 i;
    public Long j;

    public pgz(b6h1 b6h1Var, t2j0 t2j0Var, yqg yqgVar, s8h1 s8h1Var, dl3 dl3Var) {
        df dfVar = df.T0;
        this.a = b6h1Var;
        this.b = t2j0Var;
        this.c = yqgVar;
        this.d = s8h1Var;
        this.e = dl3Var;
        this.f = dfVar;
        this.h = new fj00();
        this.i = new fj00();
    }

    @Override // p.wwn0
    public final void a(rj41 rj41Var, hwn0 hwn0Var, hwn0 hwn0Var2, nsn0 nsn0Var, List list, List list2, Long l, Set set, String str) {
        y6r0 y6r0Var = hwn0Var.a;
        if (((Boolean) this.e.invoke()).booleanValue()) {
            long jB = this.c.b();
            boolean zBooleanValue = ((Boolean) this.f.invoke()).booleanValue();
            asn0 asn0Var = asn0.a;
            if (!zBooleanValue && !nsn0Var.equals(asn0Var)) {
                Long l2 = this.j;
                long jLongValue = jB - (l2 != null ? l2.longValue() : jB);
                if (jLongValue > 7200000) {
                    b(rj41Var, "Long page detected");
                }
                Long l3 = this.d.g;
                long jLongValue2 = jB - (l3 != null ? l3.longValue() : jB);
                if (jLongValue > 7200000 && jLongValue2 > 7200000) {
                    b(rj41Var, "Missing heartbeat");
                }
            }
            this.j = Long.valueOf(jB);
            if ((hwn0Var2 != null ? hwn0Var2.a : null) != null) {
                y6r0 y6r0Var2 = hwn0Var2.a;
                fj00 fj00Var = this.i;
                if (fj00Var.a.contains(y6r0Var2)) {
                    b(rj41Var, "From page instance id duplication");
                }
                fj00Var.add(hwn0Var2.a);
            }
            fj00 fj00Var2 = this.h;
            if (fj00Var2.a.contains(y6r0Var)) {
                b(rj41Var, "Page instance id duplication");
            }
            fj00Var2.add(y6r0Var);
            if (u890.j(hwn0Var2 != null ? hwn0Var2.a : null, y6r0Var)) {
                b(rj41Var, "Navigation to same page instance id");
            }
            if (nsn0Var.equals(fsn0.a)) {
                if ((hwn0Var2 != null ? hwn0Var2.b : null) != null) {
                    b(rj41Var, "Invalid Launch");
                }
            }
            if (nsn0Var.equals(asn0Var)) {
                ((qgz) this.a.a(rj41Var)).a("From: " + hwn0Var2);
                if ((hwn0Var2 != null ? hwn0Var2.a : null) == null) {
                    b(rj41Var, "Invalid Resume");
                }
            }
            bsn0 bsn0Var = bsn0.a;
            if (nsn0Var.equals(bsn0Var) && hwn0Var2 == null) {
                b(rj41Var, "Invalid background");
            }
            if (!nsn0Var.equals(bsn0Var) ? false : nsn0Var.equals(this.g)) {
                b(rj41Var, "Second background");
            }
            this.g = nsn0Var;
        }
    }

    public final void b(rj41 rj41Var, String str) {
        String strY0;
        c7h1 c7h1VarN = UbiExpr1ErrorDetection.n();
        c7h1VarN.q(str);
        qgz qgzVar = (qgz) this.a.a(rj41Var);
        synchronized (qgzVar) {
            strY0 = o7h.y0(qgzVar.c, ",\n", null, null, null, 62);
        }
        c7h1VarN.n(strY0);
        UbiExpr1ErrorDetection ubiExpr1ErrorDetectionBuild = c7h1VarN.build();
        t2j0 t2j0Var = this.b;
        ubiExpr1ErrorDetectionBuild.getClass();
        t2j0Var.a(ubiExpr1ErrorDetectionBuild);
    }
}
