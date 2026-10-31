package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mhx extends l570 {
    public final /* synthetic */ byte b;
    public final Object c;
    public final Object d;
    public final qzh e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhx(ahr ahrVar, x7z x7zVar, qzh qzhVar, vx40 vx40Var, byte b) {
        super(qzhVar.getView());
        this.b = b;
        switch (b) {
            case 1:
                super(qzhVar.getView());
                this.c = ahrVar;
                this.d = x7zVar;
                this.e = qzhVar;
                this.f = vx40Var;
                break;
            default:
                this.c = ahrVar;
                this.d = x7zVar;
                this.e = qzhVar;
                this.f = vx40Var;
                break;
        }
    }

    public final void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        String str;
        String strB;
        p811 p811Var;
        String str2;
        byte b = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.f;
        qzh qzhVar = this.e;
        byte b2 = 0;
        switch (b) {
            case 0:
                p811 p811Var2 = new p811();
                Context context = ((l570) this).a.getContext();
                String str3 = y570Var.n().a.a;
                String str4 = str3 == null ? "" : str3;
                String str5 = y570Var.n().a.b;
                String str6 = str5 == null ? "" : str5;
                String str7 = y570Var.n().a.d;
                String str8 = str7 == null ? "" : str7;
                ld70 ld70Var = y570Var.k().a.c;
                String str9 = ld70Var != null ? ld70Var.a.c : null;
                String str10 = str9 == null ? "" : str9;
                String strB2 = y570Var.g().B("gradientColor");
                String str11 = strB2 == null ? "" : strB2;
                HubsImmutableComponentBundle hubsImmutableComponentBundleG = y570Var.g();
                ahr ahrVar = (ahr) obj;
                Long lX = hubsImmutableComponentBundleG.x("duration");
                Long lX2 = hubsImmutableComponentBundleG.x("releaseTimestamp");
                int iN = hubsImmutableComponentBundleG.n(0, "progressPercentage");
                if (lX == null || lX2 == null) {
                    str = "";
                    strB = null;
                } else if (iN > 0) {
                    long jLongValue = lX.longValue();
                    str = "";
                    strB = String.format(context.getResources().getString(2131961071), Arrays.copyOf(new Object[]{ahrVar.a(jLongValue - ((((long) iN) * jLongValue) / 100))}, 1));
                } else {
                    str = "";
                    long jLongValue2 = lX.longValue();
                    long jLongValue3 = lX2.longValue();
                    String strA = ahrVar.a(jLongValue2);
                    strB = jLongValue3 > 0 ? f4i1.f(ahrVar.c.b(jLongValue3), " • ", strA) : strA;
                }
                String str12 = (strB == null && (strB = y570Var.g().B("conciseFact")) == null) ? str : strB;
                Parcelable parcelableE = yfuVar.e(y570Var);
                Bundle bundle = parcelableE instanceof Bundle ? (Bundle) parcelableE : null;
                int iN2 = y570Var.g().n(0, "progressPercentage");
                if (bundle != null) {
                    iN2 = bundle.getInt("progressKey", iN2);
                }
                p811Var2.a = new e2z(str4, str6, str8, str10, str11, str12, "", iN2, y570Var.g().b("isSaved", false), false, y570Var.g().b("isFresh", false), "");
                sc70 sc70Var = (j570) y570Var.j().get("togglePlayStateClick");
                String strB3 = sc70Var != null ? sc70Var.b.c.B("uri") : null;
                if (strB3 != null) {
                    x7z x7zVar = (x7z) obj2;
                    p811Var = p811Var2;
                    lhx lhxVar = new lhx(p811Var, this, yfuVar, y570Var, (byte) 0);
                    p811 p811Var3 = new p811();
                    p811Var3.a = new c3z(false, false, null);
                    x7zVar.a(Observable.combineLatest((ObservableSource) x7zVar.b.invoke(strB3), (ObservableSource) x7zVar.a.invoke(strB3), new tzo(p811Var3, (byte) 27)), new w7z(p811Var3, lhxVar, (byte) 0));
                    dn81 dn81Var = x7zVar.c;
                    x7zVar.a(((ObservableFromPublisher) dn81Var.b).filter(new yjp1(strB3, (byte) 21)).map(new yla(dn81Var, (byte) 28)).distinctUntilChanged(), new w7z(p811Var3, lhxVar, (byte) 1));
                } else {
                    p811Var = p811Var2;
                }
                qzhVar.n(new lbx(this, y570Var, l670Var, p811Var, (byte) 2));
                ((vx40) obj3).v(y570Var);
                break;
            case 1:
                x7z x7zVar2 = (x7z) obj2;
                boolean zB = y570Var.g().b("isLocked", false);
                p811 p811Var4 = new p811();
                ld70 ld70Var2 = y570Var.k().a.c;
                String str13 = ld70Var2 != null ? ld70Var2.a.c : null;
                String str14 = str13 == null ? "" : str13;
                String str15 = y570Var.n().a.a;
                String str16 = str15 == null ? "" : str15;
                Long lX3 = y570Var.g().x("releaseTimestamp");
                long jLongValue4 = lX3 != null ? lX3.longValue() : 0L;
                String strF = y570Var.n().a.b;
                if (strF == null) {
                    strF = "";
                }
                if (jLongValue4 > 0) {
                    String strB4 = ((ahr) obj).c.b(jLongValue4);
                    if (ihc1.y0(strF)) {
                        str2 = strB4;
                    } else {
                        strF = f4i1.f(strB4, " • ", strF);
                        str2 = strF;
                    }
                } else {
                    str2 = strF;
                }
                String strB5 = y570Var.g().B("signifier");
                String str17 = strB5 == null ? "" : strB5;
                String strB6 = y570Var.g().B("restriction");
                p811Var4.a = new vpg1(false, str14, "", "", str16, str2, zB, str17, true, strB6 != null ? qqn1.o(strB6) : 0);
                sc70 sc70Var2 = (j570) y570Var.j().get("togglePlayStateClick");
                String strB7 = sc70Var2 != null ? sc70Var2.b.c.B("uri") : null;
                x7zVar2.a(yoi1.i(x7zVar2.d.a, o6x.a), new tyx(p811Var4, this, (byte) 0));
                if (zB) {
                    qzhVar.f(p811Var4.a);
                } else if (strB7 != null) {
                    x7zVar2.a((Observable) x7zVar2.b.invoke(strB7), new tyx(p811Var4, this, (byte) 1));
                }
                qzhVar.n(new lbx(this, y570Var, l670Var, p811Var4, (byte) 4));
                ((vx40) obj3).v(y570Var);
                break;
            default:
                String str18 = y570Var.n().a.a;
                String str19 = str18 == null ? "" : str18;
                String str20 = y570Var.n().a.b;
                String str21 = str20 == null ? "" : str20;
                String str22 = y570Var.n().a.d;
                String str23 = str22 == null ? "" : str22;
                ld70 ld70Var3 = y570Var.k().a.d;
                String str24 = ld70Var3 != null ? ld70Var3.a.c : null;
                String str25 = str24 == null ? "" : str24;
                HubsImmutableComponentBundle hubsImmutableComponentBundleG2 = y570Var.g().g("counter");
                String strB8 = hubsImmutableComponentBundleG2 != null ? hubsImmutableComponentBundleG2.B("title") : null;
                HubsImmutableComponentBundle hubsImmutableComponentBundleG3 = y570Var.g().g("counter");
                Integer numR = hubsImmutableComponentBundleG3 != null ? hubsImmutableComponentBundleG3.r("count") : null;
                sc70 sc70Var3 = (j570) y570Var.j().get("shareClick");
                String strB9 = sc70Var3 != null ? sc70Var3.b.c.B("uri") : null;
                qzhVar.f(new qfo(str19, str21, str23, str25, (strB8 == null || numR == null) ? null : new ofo(strB8, numR.intValue()), !(strB9 == null || strB9.length() == 0)));
                qzhVar.n(new djx(this, y570Var, l670Var, b2));
                ((vx40) ((lc20) obj3).c).v(y570Var);
                break;
        }
    }

    public final void b(int... iArr) {
        byte b = this.b;
    }

    private final void c(int... iArr) {
    }

    private final void d(int... iArr) {
    }

    private final void e(int... iArr) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhx(qzh qzhVar, lzn0 lzn0Var, rsn0 rsn0Var, lc20 lc20Var) {
        super(qzhVar.getView());
        this.b = (byte) 2;
        this.e = qzhVar;
        this.c = lzn0Var;
        this.d = rsn0Var;
        this.f = lc20Var;
    }
}
