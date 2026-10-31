package p;

import android.app.ApplicationStartInfo;
import android.content.pm.ShortcutManager;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.common.uri.SpotifyUriParserException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.concurrent.TimeoutException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class uh61 implements Predicate, Function, f9d0, BiFunction {
    public final /* synthetic */ byte a;

    public static /* bridge */ /* synthetic */ ApplicationStartInfo b(Object obj) {
        return (ApplicationStartInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager c(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return ShortcutManager.class;
    }

    public static /* synthetic */ void g(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append((Object) " ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.common.uri.SpotifyUriParserException */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(int i, String str) throws SpotifyUriParserException {
        throw new SpotifyUriParserException(str, i);
    }

    public static /* synthetic */ void i(Object obj, Object obj2) {
        throw new UnsupportedOperationException("URI \"" + obj + obj2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public static /* synthetic */ void j(String str) throws SerializationException {
        throw new SerializationException(str);
    }

    public static /* synthetic */ void k(String str, float f) {
        throw new IllegalArgumentException(str + f);
    }

    public Object a(Object obj, Object obj2) {
        switch (this.a) {
            case 11:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new e73((byte) 1);
            case 12:
                ((qop) obj).getClass();
                ((gl90) obj2).getClass();
                return new boe((byte) 1);
            case 13:
                ((qop) obj).getClass();
                ((gl90) obj2).getClass();
                return new maa1((byte) 0);
            case 14:
                gl90 gl90Var = (gl90) obj2;
                ((qop) obj).getClass();
                gl90Var.getClass();
                return new doe((erq) ((jly0) new k2q(gl90Var).c).get());
            case 15:
            case 17:
            case 18:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                qop qopVar = (qop) obj;
                bct bctVar = (bct) obj2;
                qopVar.getClass();
                bctVar.getClass();
                d0r d0rVar = bctVar.b;
                return new fb3(d0rVar, qopVar.d(), bctVar.d, new jd6(d0rVar, qopVar.d()));
            case 16:
                ((qop) obj).getClass();
                ((pbt) obj2).getClass();
                return new q93((byte) 2);
            case 19:
                ((qop) obj).getClass();
                ((gl90) obj2).getClass();
                return new maa1((byte) 1);
            case 20:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new ymm((byte) 2);
            case 21:
                c8c0 c8c0Var = (c8c0) obj;
                c8c0Var.getClass();
                ((izu0) obj2).getClass();
                return new ic3(c8c0Var);
            case 26:
                gl90 gl90Var2 = (gl90) obj2;
                ((qop) obj).getClass();
                gl90Var2.getClass();
                return new t2n0((fsq) new ltp(gl90Var2, (byte) 1).b.get());
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((c8c0) obj).getClass();
                ((izu0) obj2).getClass();
                return new ic3((byte) 10);
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                nmr0 nmr0Var = (nmr0) obj;
                if (((th61) nmr0Var.a).b) {
                    return ((Boolean) nmr0Var.b).booleanValue() ? Single.just(vh61.c) : Single.just(vh61.a);
                }
                return Single.just(vh61.b);
            case 2:
                Throwable th = (Throwable) obj;
                return th instanceof TimeoutException ? Single.just(vh61.d) : Single.error(th);
            case 8:
                return new f5e0(obj);
            default:
                return q3p1.o((Throwable) obj);
        }
    }

    public void e(Object obj, ko20 ko20Var) {
        ((o8u0) obj).w0(new n8u0(ko20Var));
    }

    public boolean test(Object obj) {
        th61 th61Var = (th61) ((nmr0) obj).a;
        return th61Var.b && th61Var.h;
    }

    public Object apply(Object obj, Object obj2) {
        return new nmr0(obj, (String) obj2);
    }
}
