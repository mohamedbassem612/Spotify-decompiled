package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class i2w implements Update {
    public static final i2w a = new i2w();

    public final Next a(Object obj, Object obj2) {
        String str;
        job1 dmb1Var;
        m3w m3wVar = (m3w) obj;
        d3w d3wVar = (l3w) obj2;
        String str2 = m3wVar.a;
        job1 job1Var = m3wVar.c;
        if (d3wVar instanceof d3w) {
            d3w d3wVar2 = d3wVar;
            String str3 = m3wVar.b;
            if (job1Var instanceof fnb1) {
                return Next.j();
            }
            String str4 = d3wVar2.a;
            if (u890.j(str4, str3) && (job1Var instanceof bmb1)) {
                return Next.j();
            }
            if (u890.j(str4, str3)) {
                return Next.h(m3w.a(m3wVar, amb1.a, (ke81) null, 27));
            }
            return str4.length() == 0 ? Next.h(m3w.a(m3wVar, rlb1.a, (ke81) null, 27)) : Next.i(m3w.a(m3wVar, new mnb1(str4), (ke81) null, 27), Collections.singleton(new t2w(str2, str4)));
        }
        if (d3wVar instanceof k3w) {
            k3w k3wVar = (k3w) d3wVar;
            if (job1Var instanceof mnb1) {
                String str5 = k3wVar.b;
                if (u890.j(str5, ((mnb1) job1Var).a)) {
                    asi1 asi1Var = k3wVar.a;
                    if (asi1Var instanceof zri1) {
                        dmb1Var = new lnb1(str5);
                    } else {
                        if (!(asi1Var instanceof wri1)) {
                            eg.o();
                            return null;
                        }
                        dmb1Var = new dmb1(((wri1) asi1Var).a, str5);
                    }
                    return Next.h(m3w.a(m3wVar, dmb1Var, (ke81) null, 27));
                }
            }
            return Next.j();
        }
        boolean z = d3wVar instanceof f3w;
        q2w q2wVar = q2w.a;
        if (z) {
            if (job1Var instanceof lnb1) {
                str = ((lnb1) job1Var).a;
            } else {
                if (!(job1Var instanceof enb1)) {
                    return job1Var instanceof amb1 ? Next.a(Collections.singleton(q2wVar)) : Next.j();
                }
                str = ((enb1) job1Var).b;
            }
            return Next.i(m3w.a(m3wVar, new fnb1(str2, str), (ke81) null, 27), Collections.singleton(new s2w(str2, str)));
        }
        if (d3wVar instanceof h3w) {
            return job1Var instanceof fnb1 ? Next.a(Collections.singleton(q2wVar)) : Next.j();
        }
        if (d3wVar instanceof g3w) {
            fnb1 fnb1Var = job1Var instanceof fnb1 ? (fnb1) job1Var : null;
            return fnb1Var != null ? Next.h(m3w.a(m3wVar, new enb1(fnb1Var.a, fnb1Var.b), (ke81) null, 27)) : Next.j();
        }
        if (d3wVar instanceof a3w) {
            if ((job1Var instanceof bmb1) || (job1Var instanceof amb1)) {
                return Next.a(Collections.singleton(q2wVar));
            }
            return job1Var instanceof fnb1 ? Next.h(m3w.a(m3wVar, (job1) null, ke81.c, 23)) : Next.h(m3w.a(m3wVar, (job1) null, ke81.b, 23));
        }
        if (d3wVar instanceof b3w) {
            return Next.a(Collections.singleton(q2wVar));
        }
        boolean z2 = d3wVar instanceof c3w;
        ke81 ke81Var = ke81.a;
        if (z2) {
            return Next.h(m3w.a(m3wVar, (job1) null, ke81Var, 23));
        }
        if (d3wVar instanceof i3w) {
            return Next.a(Collections.singleton(q2wVar));
        }
        if (d3wVar instanceof j3w) {
            return Next.h(m3w.a(m3wVar, (job1) null, ke81Var, 23));
        }
        if (d3wVar instanceof e3w) {
            return Next.a(Collections.singleton(r2w.a));
        }
        eg.o();
        return null;
    }
}
