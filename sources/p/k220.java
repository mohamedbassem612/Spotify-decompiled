package p;

import android.app.ApplicationExitInfo;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.spotify.mobius.MobiusHooks;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class k220 implements v0i, MobiusHooks.ErrorHandler {
    public final /* synthetic */ byte a;

    public /* synthetic */ k220(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo b(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ void c() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void d(int i, int i2, Object obj, String str) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void e(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void g(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void h(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void i(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    public static /* synthetic */ void j(String str, Object obj, Object obj2) throws meh {
        throw new meh(str + obj + ((Object) " at path ") + obj2);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5);
    }

    public static /* synthetic */ void p(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void q(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void r(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    public void a(RuntimeException runtimeException) {
        MobiusHooks.a.k("Uncaught error", runtimeException);
    }

    @Override // p.v0i
    public Object m(dxy dxyVar) {
        switch (this.a) {
            case 7:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(dxyVar);
            case 8:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(dxyVar);
            case 9:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(dxyVar);
            case 10:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(dxyVar);
            case 11:
                return FirebaseSessionsRegistrar.getComponents$lambda$2(dxyVar);
            case 12:
                return FirebaseSessionsRegistrar.getComponents$lambda$3(dxyVar);
            case 13:
                return FirebaseSessionsRegistrar.getComponents$lambda$4(dxyVar);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$5(dxyVar);
        }
    }
}
