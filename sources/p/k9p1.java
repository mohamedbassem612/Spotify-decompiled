package p;

import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k9p1 implements Function, Predicate, g670 {
    public static final k9p1 c;
    public static final k9p1 d;
    public static final k9p1 e;
    public final /* synthetic */ byte a;
    public final String b;

    static {
        byte b = 0;
        c = new k9p1("ENABLED", b);
        d = new k9p1("DISABLED", b);
        e = new k9p1("DESTROYED", b);
    }

    public k9p1(Context context) {
        this.a = (byte) 1;
        this.b = context.getPackageManager().getInstallerPackageName(context.getPackageName());
    }

    public boolean a(y570 y570Var) {
        String strA = y570Var.a();
        return strA != null && ihc1.h0(strA, this.b, false);
    }

    public Object apply(Object obj) {
        ktl ktlVar;
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 2:
                bi90 bi90VarK = ekb.k((mh90) obj, str);
                if (bi90VarK != null) {
                    return bi90VarK;
                }
                hhg1.f("Not found V8 category with categoryKey = ".concat(str));
                return null;
            case 3:
                ddz ddzVar = ((uv00) obj).a(ddz.class, str).b;
                return Boolean.valueOf(ddzVar != null && (ddzVar.b.isEmpty() ^ true));
            case 4:
                jo70 jo70Var = ((uv00) obj).a(jo70.class, str).b;
                String str2 = jo70Var != null ? jo70Var.a : null;
                return str2 == null ? "" : str2;
            case 5:
                return Boolean.valueOf(u890.j(((Map) obj).get(str), Boolean.TRUE));
            case 6:
            case 9:
            case 13:
            case 14:
            default:
                return (wu21) sqg0.G(str, (Map) obj);
            case 7:
                mtl mtlVar = ((uv00) obj).a(mtl.class, str).b;
                return (mtlVar == null || (ktlVar = mtlVar.a) == null) ? ktl.a : ktlVar;
            case 8:
                mdz mdzVar = (mdz) o7h.s0((List) obj);
                if (mdzVar != null) {
                    return new fbe0(new ygy((int) (mdzVar.n / 1000), mdzVar.r.length() > 0));
                }
                return new xae0(new IllegalStateException(l1d.m("No episode metadata found for uri: ", str)));
            case 10:
                w281 w281Var = ((uv00) obj).a(w281.class, str).b;
                return Boolean.valueOf(w281Var != null && (w281Var.c ^ true));
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                f7h f7hVar = (f7h) ((Map) obj).get(str);
                return Boolean.valueOf(f7hVar != null ? f7hVar.a : false);
            case grn1.d /* 12 */:
                f7h f7hVar2 = (f7h) ((Map) obj).get(str);
                return new u230(f7hVar2 != null ? f7hVar2.a : false);
            case 15:
                return (CompletableSource) ((py21) obj).b(new pg61(str, (byte) 24), new pg61(str, (byte) 25));
            case 16:
                Logger.e((Throwable) obj, "Error on storyStartEventSource for feature ".concat(str), new Object[0]);
                return Observable.empty();
        }
    }

    public boolean test(Object obj) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 6:
                return ((kdn) obj).b.equals(str);
            case 9:
                wv00 wv00Var = (uv00) obj;
                return (wv00Var.a(uio.class, str).b == null && wv00Var.f) ? false : true;
            default:
                String strD = p1p1.D(((dld0) obj).a);
                String strD2 = p1p1.D(str);
                return (strD == null || strD2 == null || !strD.equals(strD2)) ? false : true;
        }
    }

    public String toString() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return this.b;
            default:
                return super.toString();
        }
    }

    public k9p1(o7e o7eVar, String str) {
        this.a = (byte) 2;
        this.b = str;
    }

    public /* synthetic */ k9p1(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
