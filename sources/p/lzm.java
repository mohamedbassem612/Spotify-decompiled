package p;

import android.content.ClipData;
import android.view.View;
import com.spotify.nowplayingqueue.bottomsheet.view.layoutmanager.StickyHeaderLinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lzm extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzm(int i, Function0 function0, o95 o95Var, c9n c9nVar, ven0 ven0Var) {
        super(0);
        this.a = (byte) 6;
        this.d = o95Var;
        this.e = c9nVar;
        this.c = function0;
        this.b = i;
        this.f = ven0Var;
    }

    public final Object invoke() {
        int i;
        int iS;
        byte b = this.a;
        int iS2 = 0;
        rih1 rih1Var = rih1.a;
        Object obj = this.f;
        Object obj2 = this.e;
        int i2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Function0) obj4).invoke();
                o4w o4wVarA = (o4w) obj3;
                List list = o4wVarA.b;
                List list2 = o4wVarA.a;
                xz3 xz3Var = (xz3) o7h.t0(i2, list2);
                if (xz3Var != null && !xz3Var.b() && list2.size() > 2) {
                    Iterator it = list.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                        } else if (((c4w) it.next()).b != i2) {
                            i3++;
                        }
                    }
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            iS2 = -1;
                        } else if (((c4w) it2.next()).a != i2) {
                            iS2++;
                        }
                    }
                    if (i3 != -1 && iS2 != -1) {
                        c4w c4wVar = (c4w) list.get(i3);
                        c4w c4wVar2 = (c4w) list.get(iS2);
                        c4w c4wVar3 = new c4w(c4wVar.a, c4wVar2.b, z6x.a, Float.intBitsToFloat((int) (((xz3) list2.get(c4wVar.a)).a >> 32)), Float.intBitsToFloat((int) (((xz3) list2.get(c4wVar2.b)).a >> 32)));
                        ArrayList arrayList = new ArrayList(list2);
                        arrayList.remove(i2);
                        ArrayList<c4w> arrayList2 = new ArrayList(list);
                        arrayList2.remove(iS2);
                        arrayList2.remove(i3);
                        arrayList2.add(i3, c4wVar3);
                        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                        for (c4w c4wVar4 : arrayList2) {
                            int i4 = c4wVar4.a;
                            if (i4 > i2) {
                                i4--;
                            }
                            int i5 = i4;
                            int i6 = c4wVar4.b;
                            if (i6 > i2) {
                                i6--;
                            }
                            arrayList3.add(c4w.a(c4wVar4, i5, i6, (List) null, 0.0f, 0.0f, 28));
                        }
                        o4wVarA = o4w.a(o4wVarA, arrayList, arrayList3, (Integer) null, 28);
                    }
                }
                ((gb5) obj2).d(o4wVarA);
                ((vu30) obj).invoke(o4wVarA, yoo.c);
                return rih1Var;
            case 1:
                err0 err0Var = (hdn0) obj4;
                int iS3 = err0Var.s();
                err0Var.t(iS3);
                ((ven0) obj2).setValue(Integer.valueOf(i2));
                ((iu30) obj3).invoke(Integer.valueOf(iS3));
                ((ven0) obj).setValue(Boolean.FALSE);
                return rih1Var;
            case 2:
                ((ods) obj3).d(((cfq0) obj2).a, (nsn0) obj, i2, (Function0) obj4);
                return rih1Var;
            case 3:
                teb tebVar = (teb) obj4;
                ito itoVar = (ito) obj3;
                if (u890.j(tebVar.g(), itoVar.b)) {
                    tebVar.i((lvc1) obj2, i2, itoVar.b, (String) obj);
                }
                return rih1Var;
            case 4:
                b6t b6tVar = (k6a1) obj4;
                if (b6tVar != null) {
                    b6tVar.a();
                }
                ((az20) obj3).b(true);
                ((vu30) obj).invoke((aoe0) obj2, Integer.valueOf(i2));
                return rih1Var;
            case 5:
                err0 err0Var2 = (hdn0) obj4;
                int iS4 = err0Var2.s();
                err0 err0Var3 = (hdn0) obj3;
                int iS5 = err0Var3.s();
                err0 err0Var4 = (hdn0) obj2;
                int iS6 = err0Var4.s();
                if (iS4 <= 0 || iS5 <= 0 || (i = (((iS4 - (iS5 * 2)) - iS6) - i2) / 2) < 0) {
                    i = 0;
                }
                int iS7 = err0Var3.s() + i;
                int iS8 = (((hdn0) obj).s() + err0Var4.s()) - err0Var2.s();
                if (iS8 < 0) {
                    iS8 = 0;
                }
                int iS9 = ((err0Var4.s() + (err0Var3.s() * 2)) + i2) - err0Var2.s();
                return Integer.valueOf(Math.max(iS8, iS9 >= 0 ? iS9 : 0) + iS7);
            case 6:
                o95 o95Var = (o95) obj3;
                c9n c9nVar = (c9n) obj2;
                if (((Number) o95Var.e()).floatValue() > 80.0f) {
                    fn31.T(c9nVar, (o8n) null, 0, new skk0(o95Var, i2, (lnm) null, (byte) 1), 3);
                    ((Function0) obj4).invoke();
                    ((ven0) obj).setValue(Boolean.FALSE);
                } else {
                    fn31.T(c9nVar, (o8n) null, 0, new b(o95Var, (lnm) null, (byte) 16), 3);
                }
                return rih1Var;
            case 7:
                String str = (String) obj2;
                cde1 cde1Var = (cde1) obj4;
                ven0 ven0Var = (ven0) obj;
                r8e1 r8e1Var = (r8e1) ven0Var.getValue();
                if (r8e1Var != null) {
                    int i7 = r8e1Var.a - i2;
                    if (i7 >= 0) {
                        iS2 = i7;
                    }
                } else {
                    iS2 = cde1Var.a.s();
                }
                r8e1 r8e1Var2 = (r8e1) ven0Var.getValue();
                if (r8e1Var2 != null) {
                    iS = r8e1Var2.b - i2;
                    int length = str.length();
                    if (iS > length) {
                        iS = length;
                    }
                } else {
                    iS = cde1Var.b.s();
                }
                ((vng) obj3).a().setPrimaryClip(ClipData.newPlainText("plain text", nb51.p(new af5(str.substring(iS2, iS)))));
                ven0Var.setValue((Object) null);
                cde1Var.a();
                return rih1Var;
            default:
                return StickyHeaderLinearLayoutManager.D1((StickyHeaderLinearLayoutManager) obj4, (View) obj3, i2, (n611) obj2, (s611) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lzm(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(0);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzm(int i, hdn0 hdn0Var, hdn0 hdn0Var2, hdn0 hdn0Var3, hdn0 hdn0Var4) {
        super(0);
        this.a = (byte) 5;
        this.b = i;
        this.c = hdn0Var;
        this.d = hdn0Var2;
        this.e = hdn0Var3;
        this.f = hdn0Var4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzm(teb tebVar, ito itoVar, lvc1 lvc1Var, int i, String str) {
        super(0);
        this.a = (byte) 3;
        this.c = tebVar;
        this.d = itoVar;
        this.e = lvc1Var;
        this.b = i;
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzm(ods odsVar, cfq0 cfq0Var, nsn0 nsn0Var, int i, Function0 function0) {
        super(0);
        this.a = (byte) 2;
        this.d = odsVar;
        this.e = cfq0Var;
        this.f = nsn0Var;
        this.b = i;
        this.c = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzm(hdn0 hdn0Var, int i, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2) {
        super(0);
        this.a = (byte) 1;
        this.c = hdn0Var;
        this.b = i;
        this.d = iu30Var;
        this.e = ven0Var;
        this.f = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzm(k6a1 k6a1Var, az20 az20Var, vu30 vu30Var, aoe0 aoe0Var, int i) {
        super(0);
        this.a = (byte) 4;
        this.c = k6a1Var;
        this.d = az20Var;
        this.f = vu30Var;
        this.e = aoe0Var;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzm(cde1 cde1Var, vng vngVar, String str, ven0 ven0Var, int i) {
        super(0);
        this.a = (byte) 7;
        this.c = cde1Var;
        this.d = vngVar;
        this.e = str;
        this.f = ven0Var;
        this.b = i;
    }
}
