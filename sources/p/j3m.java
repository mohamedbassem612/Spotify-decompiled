package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.util.ULocale;
import android.view.accessibility.AccessibilityManager;
import android.webkit.CookieManager;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.martini.martinidata.model.Mode;
import com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider;
import io.reactivex.rxjava3.core.Single;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j3m extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3m(d5n d5nVar, c5n c5nVar) {
        super(0);
        this.a = (byte) 15;
        this.b = c5nVar;
    }

    public final Object invoke() throws IOException {
        m231 m231Var;
        byte b = this.a;
        byte[] byteArray = null;
        m231 m231Var2 = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                k3m k3mVar = (k3m) obj;
                u4p u4pVar = k3mVar.d;
                d0r d0rVar = k3mVar.a;
                wj3 wj3Var = (wj3) u4pVar.a.c;
                lzn0 lzn0VarC = ((t1m) wj3Var.d).c();
                c8o.l(lzn0VarC);
                wj3Var.getClass();
                t1m t1mVar = (t1m) wj3Var.d;
                Single singleP0 = t1mVar.P0();
                c8o.l(singleP0);
                nfa0 nfa0VarA0 = t1mVar.A0();
                c8o.l(nfa0VarA0);
                return new vky(d0rVar, lzn0VarC, new tn01(singleP0, nfa0VarA0, (tcy) ((jly0) wj3Var.i).get()), (b2p) wj3Var.N0);
            case 1:
                f8m f8mVar = (f8m) obj;
                return f8mVar.c.a(f8mVar.h, false, Mode.MARTINI);
            case 2:
                return Integer.valueOf((int) (((Number) ((haa) ((rfm) obj)).V1.getValue()).intValue() * 0.6f));
            case 3:
                jgm jgmVar = (jgm) obj;
                return new kpg0(jgmVar.b.a(new fna(jgmVar, (byte) 23)), afm.Y);
            case 4:
                ((vrv0) obj).l();
                return m231Var2;
            case 5:
                ((tt9) obj).a.invoke(hif0.a);
                return m231Var2;
            case 6:
                ejm ejmVar = (ejm) obj;
                return new kpg0(ejmVar.b.a(new jc9((Object) ejmVar, (byte) 27)), afm.U0);
            case 7:
                if (((klm) obj).h != null) {
                    return m231Var2;
                }
                u890.C("scopeName");
                throw null;
            case 8:
                wmm wmmVar = (wmm) obj;
                wmmVar.b.getClass();
                return new kpg0(new hz5((byte) 7), new qrk(wmmVar, (byte) 4));
            case 9:
                return new uvk0(((fqm) obj).a);
            case 10:
                csm csmVar = (csm) obj;
                String str = csmVar.b.b;
                csmVar.d.a(csmVar.c, str, hap1.o(str, (xkg0) null));
                return m231Var2;
            case 11:
                return new kpg0((xpw) ((d82) obj).d.get(), crm.O0);
            case 12:
                ((CookieManager) obj).removeAllCookies(null);
                return m231Var2;
            case 13:
                return (i8h1) ((a4n) obj).a.get();
            case 14:
                Resources resources = ((r4n) obj).a.getContext().getResources();
                return Integer.valueOf((resources.getDimensionPixelSize(2131165561) * 2) + resources.getDimensionPixelSize(2131165560));
            case 15:
                try {
                    Thread.sleep(4000L);
                    m231Var = m231Var2;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                c5n c5nVar = (c5n) obj;
                if (!(m231Var instanceof m231)) {
                    c5nVar.invoke();
                }
                return m231Var2;
            case 16:
                e5n e5nVar = (e5n) obj;
                luk lukVar = e5nVar.b;
                if (lukVar != null) {
                    return lukVar.e(new d26(e5nVar, (byte) 12));
                }
                return null;
            case 17:
                ((AtomicBoolean) ((tnm) obj).h).set(false);
                return m231Var2;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((qzh) ((y9n) obj).b.getValue()).getView();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new DecimalFormat(((san) obj).a, new DecimalFormatSymbols(ULocale.ROOT));
            case 20:
                return ((jbn) obj).X.e();
            case 21:
                Object systemService = ((Context) ((jl1) obj).b).getSystemService("accessibility");
                if (systemService instanceof AccessibilityManager) {
                    return (AccessibilityManager) systemService;
                }
                return null;
            case 22:
                return ((ttm0) ((kly0) ((k9k) obj).b).get()).c(false);
            case 23:
                Bitmap bitmap = ((odn) obj).a.b;
                if (bitmap != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            u890.p(byteArrayOutputStream, th2);
                            throw th3;
                        }
                    }
                }
                return byteArray;
            case 24:
                ynb0 ynb0Var = ((kaa) ((CoverScreenWidgetProvider) obj)).d;
                if (ynb0Var != null) {
                    return sqg0.U(((rol1) ynb0Var.get()).a);
                }
                u890.C("bitmapCache");
                throw null;
            case 25:
                return ((kun) obj).O0;
            case 26:
                return (tl7) ((vh) obj).c;
            case 27:
                return (p1r0) ((j7p) obj).get();
            case 28:
                ((bzm) obj).invoke((Object) null);
                return m231Var2;
            default:
                ((i6b) obj).o(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
                return m231Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3m(klm klmVar, String str) {
        super(0);
        this.a = (byte) 7;
        this.b = klmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3m(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }
}
