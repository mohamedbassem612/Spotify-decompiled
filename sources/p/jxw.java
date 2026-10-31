package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jxw extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nxw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jxw(nxw nxwVar, byte b) {
        super(1);
        this.a = b;
        this.b = nxwVar;
    }

    public final Object invoke(Object obj) {
        String str;
        Object objInvoke;
        byte b = this.a;
        byw bywVar = byw.a;
        nxw nxwVar = this.b;
        switch (b) {
            case 0:
                axw axwVar = (axw) obj;
                String str2 = axwVar.a;
                boolean zJ = u890.j(nxwVar.b(), str2);
                Pattern pattern = qyw.a;
                boolean z = str2.length() > 0 && qyw.a.matcher(str2).matches();
                if (zJ) {
                    return Next.j();
                }
                if (str2.length() == 0) {
                    return Next.h(nxw.a(nxwVar, bywVar, false, false, 14));
                }
                return Next.h(nxw.a(nxwVar, z ? new dyw(str2) : new cyw(str2, 130), false, axwVar.b, 6));
            case 1:
                String strB = nxwVar.b();
                String str3 = ((exw) obj).a;
                if (u890.j(strB, str3)) {
                    hyw hywVar = nxwVar.a;
                    if ((hywVar instanceof dyw) || (hywVar instanceof cyw)) {
                        return Next.i(nxw.a(nxwVar, new gyw(str3), false, false, 14), Effects.a(new uww[]{new uww(str3, nxwVar.d)}));
                    }
                }
                return Next.j();
            case 2:
                dxw dxwVar = (dxw) obj;
                qgo1 qgo1Var = dxwVar.a;
                boolean z2 = qgo1Var instanceof tyw;
                if (z2) {
                    str = ((tyw) qgo1Var).c;
                } else if (qgo1Var instanceof syw) {
                    str = ((syw) qgo1Var).c;
                } else {
                    if (!(qgo1Var instanceof ryw)) {
                        eg.o();
                        return null;
                    }
                    str = ((ryw) qgo1Var).c;
                }
                if (!u890.j(nxwVar.b(), str)) {
                    return Next.j();
                }
                m3n m3nVar = new m3n(dxwVar, nxwVar, str, (byte) 25);
                ixw ixwVar = new ixw(nxwVar, str, (byte) 0);
                ixw ixwVar2 = new ixw(nxwVar, str, (byte) 1);
                if (z2) {
                    objInvoke = m3nVar.invoke(qgo1Var);
                } else if (qgo1Var instanceof syw) {
                    objInvoke = ixwVar.invoke(qgo1Var);
                } else {
                    if (!(qgo1Var instanceof ryw)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = ixwVar2.invoke(qgo1Var);
                }
                return (Next) objInvoke;
            case 3:
                HashSet hashSet = new HashSet();
                eyw eywVar = nxwVar.a;
                if (eywVar instanceof eyw) {
                    hashSet.add(new qww(eywVar.a));
                } else {
                    if (eywVar instanceof dyw) {
                        hashSet.add(new uww(nxwVar.b(), true));
                        return Next.i(nxw.a(nxwVar, new gyw(nxwVar.b()), false, false, 10), hashSet);
                    }
                    if (eywVar instanceof cyw) {
                        if (((cyw) eywVar).b == 20) {
                            hashSet.add(new tww(nxwVar.b()));
                        }
                    } else if (!u890.j(eywVar, bywVar) && !(eywVar instanceof fyw) && !(eywVar instanceof gyw)) {
                        eg.o();
                        return null;
                    }
                }
                return Next.i(nxw.a(nxwVar, null, false, false, 11), hashSet);
            default:
                return Next.h(nxw.a(nxwVar, null, ((fxw) obj).a, false, 13));
        }
    }
}
