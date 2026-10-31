package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class heb implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public heb(boolean z, Function0 function0, ven0 ven0Var) {
        this.a = (byte) 3;
        this.b = z;
        this.c = function0;
        this.d = ven0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:91:0x0189  */
    public final Object emit(Object obj, lnm lnmVar) {
        j4c j4cVar;
        ipc ipcVar;
        h8k1 h8k1Var;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.d;
        boolean z = this.b;
        Object obj3 = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                if (((String) obj).length() > 0) {
                    l811 l811Var = (l811) obj3;
                    if (!l811Var.a) {
                        l811Var.a = true;
                        if (z) {
                            ((iu30) obj2).invoke(fdb.a);
                        }
                    }
                }
                return rih1Var;
            case 1:
                dn60 dn60Var = (dn60) obj2;
                if (lnmVar instanceof j4c) {
                    j4cVar = (j4c) lnmVar;
                    int i = j4cVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        j4cVar.b = i - Integer.MIN_VALUE;
                    } else {
                        j4cVar = new j4c(this, lnmVar);
                    }
                } else {
                    j4cVar = new j4c(this, lnmVar);
                }
                Object obj4 = j4cVar.a;
                int i2 = j4cVar.b;
                if (i2 == 0) {
                    hm5.M(obj4);
                    vr20 vr20Var = (vr20) obj3;
                    ((Boolean) obj).getClass();
                    dn60 dn60Var2 = !z ? (dn60) ((en60) tm60.e).b.get(new Float(dn60Var.d)) : (dn60) ((en60) tm60.e).c.get(new Float(dn60Var.d));
                    if (dn60Var2 != null) {
                        j4cVar.b = 1;
                        if (vr20Var.emit(dn60Var2, j4cVar) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj4);
                }
                return rih1Var;
            case 2:
                if (lnmVar instanceof ipc) {
                    ipcVar = (ipc) lnmVar;
                    int i3 = ipcVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ipcVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        ipcVar = new ipc(this, lnmVar);
                    }
                } else {
                    ipcVar = new ipc(this, lnmVar);
                }
                Object obj5 = ipcVar.a;
                int i4 = ipcVar.b;
                if (i4 != 0) {
                    if (i4 == 1 || i4 == 2) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                vr20 vr20Var2 = (vr20) obj3;
                lb31 lb31Var = (pb31) obj;
                if (!(lb31Var instanceof kb31) && !(lb31Var instanceof mb31)) {
                    if (!(lb31Var instanceof nb31)) {
                        if (lb31Var instanceof lb31) {
                            lb31 lb31Var2 = lb31Var;
                            List<nsn> list = lb31Var2.c;
                            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                            for (nsn nsnVar : list) {
                                if (nsnVar instanceof nsn) {
                                    nsn nsnVar2 = nsnVar;
                                    h8k1Var = new h8k1(new apc(nsnVar2.a, ((kpc) obj2).a, nsnVar2.b), nsnVar);
                                } else if (nsnVar instanceof osn) {
                                    h8k1Var = new h8k1(new cpc(((osn) nsnVar).a), nsnVar);
                                } else {
                                    eg.o();
                                }
                                arrayList.add(h8k1Var);
                            }
                            if (z && (lb31Var2.f instanceof jm90) && lb31Var2.e) {
                                zoc zocVar = zoc.a;
                                arrayList = o7h.O0(new h8k1(zocVar, zocVar), arrayList);
                            } else if (lb31Var2.d.b != l620.a) {
                                bpc bpcVar = bpc.a;
                                arrayList = o7h.O0(new h8k1(bpcVar, bpcVar), arrayList);
                            }
                            ipcVar.b = 2;
                            if (vr20Var2.emit(arrayList, ipcVar) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    ipcVar.b = 1;
                    if (vr20Var2.emit(z6x.a, ipcVar) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            case 3:
                qt80 qt80Var = (qt80) obj;
                Function0 function0 = (Function0) obj3;
                ven0 ven0Var = (ven0) obj2;
                if (qt80Var instanceof r9w0) {
                    ven0Var.setValue(Boolean.FALSE);
                    if (z && function0 != null) {
                        function0.invoke();
                    }
                } else if (qt80Var instanceof o5v) {
                    ven0Var.setValue(Boolean.TRUE);
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else if ((qt80Var instanceof q9w0) || (qt80Var instanceof n5v)) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                return rih1Var;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                n2u0 n2u0Var = (n2u0) obj3;
                l2u0 l2u0Var = (l2u0) n2u0Var.c.getValue();
                if (l2u0Var != null) {
                    n2u0Var.b(l2u0.a(l2u0Var, !z && zBooleanValue, 0L, ((l8m1) obj2).k.b(), false, !zBooleanValue ? new Integer(1) : l2u0Var.h, 366));
                }
                return rih1Var;
        }
    }

    public /* synthetic */ heb(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
