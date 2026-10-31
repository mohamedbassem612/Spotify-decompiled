package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.player.model.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ljp1 implements Function, Predicate {
    public static final ljp1 X;
    public static final ljp1 Y;
    public static final ljp1 c;
    public static final ljp1 d;
    public static final ljp1 e;
    public static final ljp1 f;
    public static final ljp1 g;
    public static final ljp1 h;
    public static final ljp1 i;
    public static final ljp1 t;
    public final /* synthetic */ byte a;
    public final String b;

    static {
        byte b = 0;
        c = new ljp1("ED25519", b);
        d = new ljp1("ECDSA_P256", b);
        e = new ljp1("ECDSA_P384", b);
        f = new ljp1("ECDSA_P521", b);
        g = new ljp1("RSA2048_PSS", b);
        h = new ljp1("RSA3072_PSS", b);
        i = new ljp1("RSA4096_PSS", b);
        t = new ljp1("RSA2048_PKCS1", b);
        X = new ljp1("RSA3072_PKCS1", b);
        Y = new ljp1("RSA4096_PKCS1", b);
    }

    public /* synthetic */ ljp1(byte b, Object obj, String str) {
        this.a = b;
        this.b = str;
    }

    public Object apply(Object obj) {
        Observable observableJust;
        byte b = this.a;
        boolean z = false;
        String str = this.b;
        switch (b) {
            case 1:
                br8 br8Var = (fr8) obj;
                if (br8Var instanceof br8) {
                    br8 br8Var2 = br8Var;
                    if (u890.j(br8Var2.c, str)) {
                        return new j2b1(br8Var2.a);
                    }
                }
                return i2b1.a;
            case 2:
                Logger.e((Throwable) obj, "Couldn't resolve top tracks for artist ".concat(str), new Object[0]);
                return z6x.a;
            case 3:
                return ((uv00) obj).a(lo7.class, str);
            case 4:
            case grn1.d /* 12 */:
            default:
                Logger.e((Throwable) obj, "Error on storyContainerStateEventSource for feature ".concat(str), new Object[0]);
                return Observable.empty();
            case 5:
                return ((uv00) obj).a(jo70.class, str);
            case 6:
                mtl mtlVar = ((uv00) obj).a(mtl.class, str).b;
                return mtlVar == null ? new mtl() : mtlVar;
            case 7:
                return str;
            case 8:
                Map map = (Map) obj;
                if (!map.containsKey(str)) {
                    eg.m(l1d.m("No episode found matching uri: ", str));
                    return null;
                }
                Object obj2 = map.get(str);
                obj2.getClass();
                return new h9z((i1z) obj2);
            case 9:
                for (mvp0 mvp0Var : ((nvp0) obj).a) {
                    String str2 = mvp0Var.a;
                    int i2 = mvp0Var.b;
                    Set set = s4b1.f;
                    if (u890.j(uic.x(str2).F(), str) && i2 == 2) {
                        return new u410(Context.fromUri(str2));
                    }
                }
                return t410.a;
            case 10:
                return Boolean.valueOf(((List) obj).contains(str));
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                l1z l1zVar = ((uv00) obj).a(l1z.class, str).b;
                if (l1zVar != null && !l1zVar.b) {
                    z = true;
                }
                return new o640(z, (String) null);
            case 13:
                f7h f7hVar = (f7h) ((Map) obj).get(str);
                return f7hVar == null ? new f7h(false, false, false) : f7hVar;
            case 14:
                ez00 ez00Var = ((uv00) obj).a(xkk1.class, str).b;
                return (ez00Var == null || (observableJust = Observable.just(ez00Var)) == null) ? Observable.empty() : observableJust;
            case 15:
                jo70 jo70Var = ((uv00) obj).a(jo70.class, str).b;
                return jo70Var != null ? new mmr0(str, jo70Var) : new mmr0("", new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31));
        }
    }

    public boolean test(Object obj) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 4:
                return u890.j(str, ((a5j0) obj).a().a);
            case grn1.d /* 12 */:
                return u890.j(((MessageResponse) obj).getMessageRequestId(), str);
            default:
                return ((uv00) obj).a(zoy0.class, str).b != null;
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

    public /* synthetic */ ljp1(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
