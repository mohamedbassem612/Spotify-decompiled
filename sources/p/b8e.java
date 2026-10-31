package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class b8e implements Update {
    public static final b8e a = new b8e();

    public final Next a(Object obj, Object obj2) {
        Object next;
        e8e e8eVar = (e8e) obj;
        x7e x7eVar = (x7e) obj2;
        rh90 rh90Var = e8eVar.a;
        boolean z = x7eVar instanceof s7e;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        kfe kfeVar = kfe.b;
        kfe kfeVar2 = kfe.a;
        if (z) {
            s7e s7eVar = (s7e) x7eVar;
            rh90 rh90Var2 = rh90Var instanceof rh90 ? rh90Var : null;
            if (rh90Var2 == null) {
                return Next.j();
            }
            yge ygeVar = rh90Var2.e;
            boolean z2 = s7eVar.c;
            int i = s7eVar.a;
            kfe kfeVar3 = s7eVar.b;
            if (z2) {
                if (kfeVar3 == kfeVar) {
                    ygeVar.a = Boolean.TRUE;
                }
                if (kfeVar3 == kfeVar2) {
                    ygeVar.b = Boolean.TRUE;
                }
                return Next.i(e8eVar, f46.S0(new gio1[]{new q7e(rh90Var2, kfeVar3), new p7e(i, kfeVar3, rh90Var2, z2)}));
            }
            if (kfeVar3 == kfeVar) {
                ygeVar.a = Boolean.FALSE;
            }
            if (kfeVar3 == kfeVar2) {
                ygeVar.b = Boolean.FALSE;
            }
            return Next.i(e8eVar, f46.S0(new gio1[]{new r7e(rh90Var2, kfeVar3), new p7e(i, kfeVar3, rh90Var2, z2)}));
        }
        if (x7eVar instanceof t7e) {
            t7e t7eVar = (t7e) x7eVar;
            boolean z3 = t7eVar.c;
            int i2 = t7eVar.a;
            kfe kfeVar4 = t7eVar.b;
            rh90 rh90Var3 = t7eVar.d;
            if (!z3) {
                if (rh90Var instanceof mh90) {
                    for (Object obj6 : ((mh90) rh90Var).f) {
                        if (u890.j((bi90) obj6, rh90Var3)) {
                            obj4 = obj6;
                            break;
                        }
                    }
                    rh90 rh90Var4 = (bi90) obj4;
                    if (rh90Var4 != null) {
                        if (kfeVar4 == kfeVar2) {
                            rh90Var4.e.b = Boolean.FALSE;
                        }
                        if (kfeVar4 == kfeVar) {
                            rh90Var4.e.a = Boolean.FALSE;
                        }
                    }
                }
                return Next.i(e8eVar, f46.S0(new gio1[]{new r7e(rh90Var3, kfeVar4), new p7e(i2, kfeVar4, rh90Var3, z3)}));
            }
            if (rh90Var instanceof mh90) {
                Iterator it = ((mh90) rh90Var).f.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!u890.j((bi90) next, rh90Var3));
                rh90 rh90Var5 = (bi90) next;
                int iOrdinal = kfeVar4.ordinal();
                if (iOrdinal == 0) {
                    rh90Var5.e.b = Boolean.TRUE;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    rh90Var5.e.a = Boolean.TRUE;
                }
            }
            return Next.i(e8eVar, f46.S0(new gio1[]{new q7e(rh90Var3, kfeVar4), new p7e(i2, kfeVar4, rh90Var3, z3)}));
        }
        if (x7eVar instanceof v7e) {
            return Next.j();
        }
        if (!(x7eVar instanceof u7e)) {
            eg.o();
            return null;
        }
        u7e u7eVar = (u7e) x7eVar;
        boolean z4 = u7eVar.b;
        rh90 rh90Var6 = u7eVar.c;
        kfe kfeVar5 = u7eVar.a;
        if (z4) {
            if (rh90Var instanceof rh90) {
                if (kfeVar5 == kfeVar) {
                    rh90Var.e.a = Boolean.FALSE;
                }
                if (kfeVar5 == kfeVar2) {
                    rh90Var.e.b = Boolean.FALSE;
                }
            } else {
                if (!(rh90Var instanceof mh90)) {
                    eg.o();
                    return null;
                }
                for (Object obj7 : ((mh90) rh90Var).f) {
                    if (u890.j((bi90) obj7, rh90Var6)) {
                        obj5 = obj7;
                        break;
                    }
                }
                rh90 rh90Var7 = (bi90) obj5;
                if (rh90Var7 != null) {
                    if (kfeVar5 == kfeVar) {
                        rh90Var7.e.a = Boolean.FALSE;
                    }
                    if (kfeVar5 == kfeVar2) {
                        rh90Var7.e.b = Boolean.FALSE;
                    }
                }
            }
        } else if (rh90Var instanceof rh90) {
            if (kfeVar5 == kfeVar) {
                rh90Var.e.a = Boolean.TRUE;
            }
            if (kfeVar5 == kfeVar2) {
                rh90Var.e.b = Boolean.TRUE;
            }
        } else {
            if (!(rh90Var instanceof mh90)) {
                eg.o();
                return null;
            }
            for (Object obj8 : ((mh90) rh90Var).f) {
                if (u890.j((bi90) obj8, rh90Var6)) {
                    obj3 = obj8;
                    break;
                }
            }
            rh90 rh90Var8 = (bi90) obj3;
            if (rh90Var8 != null) {
                if (kfeVar5 == kfeVar) {
                    rh90Var8.e.a = Boolean.TRUE;
                }
                if (kfeVar5 == kfeVar2) {
                    rh90Var8.e.b = Boolean.TRUE;
                }
            }
        }
        return Next.h(e8eVar);
    }
}
