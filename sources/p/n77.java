package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n77 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public n77(cr6 cr6Var, int i, String str, Consumer consumer) {
        this.a = (byte) 2;
        this.c = cr6Var;
        this.b = i;
        this.d = str;
        this.e = consumer;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0109  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public final Object emit(Object obj, lnm lnmVar) {
        jed jedVar;
        Object objN;
        int i;
        int i2;
        vr20 vr20Var;
        vr20 vr20Var2;
        e331 e331Var;
        afd1 afd1Var;
        String rdv0Var;
        byte b = this.a;
        int i3 = this.b;
        d9n d9nVar = d9n.a;
        int i4 = 1;
        int i5 = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                yvg1 yvg1Var = (yvg1) obj;
                l811 l811Var = (l811) obj2;
                int iIntValue = ((Number) yvg1Var.a).intValue();
                boolean zBooleanValue = ((Boolean) yvg1Var.b).booleanValue();
                int iIntValue2 = ((Number) yvg1Var.c).intValue();
                n811 n811Var = (n811) obj3;
                if (iIntValue != n811Var.a) {
                    n811Var.a = iIntValue;
                    l811Var.a = false;
                }
                if (!l811Var.a && iIntValue != 0 && iIntValue2 >= 0 && zBooleanValue && iIntValue2 + i3 >= iIntValue - 1) {
                    ((Function0) obj4).invoke();
                    l811Var.a = true;
                }
                return rih1Var;
            case 1:
                bfd bfdVar = (bfd) obj2;
                if (lnmVar instanceof jed) {
                    jedVar = (jed) lnmVar;
                    int i6 = jedVar.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        jedVar.b = i6 - Integer.MIN_VALUE;
                    } else {
                        jedVar = new jed(this, lnmVar);
                    }
                } else {
                    jedVar = new jed(this, lnmVar);
                }
                Object objE = jedVar.a;
                int i7 = jedVar.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        int i8 = jedVar.f;
                        int i9 = jedVar.d;
                        vr20Var = jedVar.c;
                        hm5.M(objE);
                        objN = ((e331) objE).a;
                        i2 = i8;
                        i = i9;
                    } else if (i7 == 2) {
                        i = jedVar.d;
                        vr20Var2 = jedVar.c;
                        hm5.M(objE);
                        objN = (goe) objE;
                        vr20Var = vr20Var2;
                        e331Var = new e331(objN);
                        jedVar.c = null;
                        jedVar.d = i;
                        jedVar.b = 3;
                        if (vr20Var.emit(e331Var, jedVar) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (i7 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objE);
                    }
                    return rih1Var;
                }
                hm5.M(objE);
                vr20 vr20Var3 = (vr20) obj3;
                jedVar.c = vr20Var3;
                jedVar.d = 0;
                jedVar.f = 0;
                jedVar.b = 1;
                objN = bfdVar.n(i3, (String) obj4, jedVar);
                if (objN == d9nVar) {
                    return d9nVar;
                }
                i = 0;
                i2 = 0;
                vr20Var = vr20Var3;
                if (!(objN instanceof m231)) {
                    aod aodVar = bfdVar.a;
                    jedVar.c = vr20Var;
                    jedVar.d = i;
                    jedVar.f = i2;
                    jedVar.b = 2;
                    objE = aodVar.e((goe) objN, false, jedVar);
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                    vr20Var2 = vr20Var;
                    objN = (goe) objE;
                    vr20Var = vr20Var2;
                }
                e331Var = new e331(objN);
                jedVar.c = null;
                jedVar.d = i;
                jedVar.b = 3;
                if (vr20Var.emit(e331Var, jedVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 2:
                bzd0 bzd0Var = (bzd0) obj;
                Object objA = ((cr6) obj3).a(bzd0Var.a, bzd0Var.b, this.b, (String) obj2, (Consumer) obj4, lnmVar);
                return objA == d9nVar ? objA : rih1Var;
            default:
                ufr0 ufr0Var = (ufr0) obj4;
                if (lnmVar instanceof afd1) {
                    afd1Var = (afd1) lnmVar;
                    int i10 = afd1Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        afd1Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        afd1Var = new afd1(this, lnmVar);
                    }
                } else {
                    afd1Var = new afd1(this, lnmVar);
                }
                Object obj5 = afd1Var.a;
                int i11 = afd1Var.b;
                if (i11 == 0) {
                    hm5.M(obj5);
                    vr20 vr20Var4 = (vr20) obj3;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    for (Object obj6 : list) {
                        int i12 = i5 + 1;
                        if (i5 < 0) {
                            p7h.T();
                            throw null;
                        }
                        dfr0 dfr0Var = (qfr0) obj6;
                        if (dfr0Var instanceof dfr0) {
                            rdv0Var = f4i1.c(dfr0Var.a, "popular-release-skeleton-");
                        } else if (((rfr0) obj2).b && (dfr0Var instanceof eer0)) {
                            eer0 eer0Var = (eer0) dfr0Var;
                            rdv0Var = new rdv0(eer0Var.b, ufr0Var.b, eer0Var.a);
                        } else {
                            rdv0Var = ufr0Var.a + ":" + i3 + ":" + i5;
                        }
                        arrayList.add(new h8k1(dfr0Var, rdv0Var));
                        i5 = i12;
                        i4 = 1;
                    }
                    afd1Var.b = i4;
                    if (vr20Var4.emit(arrayList, afd1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i11 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var;
        }
    }

    public /* synthetic */ n77(vr20 vr20Var, Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = vr20Var;
        this.d = obj;
        this.e = obj2;
        this.b = i;
    }

    public n77(n811 n811Var, l811 l811Var, int i, Function0 function0) {
        this.a = (byte) 0;
        this.c = n811Var;
        this.d = l811Var;
        this.b = i;
        this.e = function0;
    }
}
