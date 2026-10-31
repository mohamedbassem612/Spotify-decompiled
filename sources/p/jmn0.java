package p;

import com.spotify.authentication.credentials.UnencryptedCredentials;
import com.spotify.authentication.login5.Login5Configuration;
import com.spotify.authentication.login5setupimpl.NativeLogin5SetupImpl;
import com.spotify.authentication.oauth.AccessToken;
import com.spotify.authentication.oauthsetupimpl.NativeOAuthSetupImpl;
import com.spotify.concurrency.asyncimpl.NativeTimerManagerThreadImpl;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import com.spotify.esperanto.esperantoimpl.SchedulingTransport;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jmn0 implements Runnable {
    public final /* synthetic */ tg8 a;
    public final /* synthetic */ kmn0 b;
    public final /* synthetic */ obl c;
    public final /* synthetic */ SharedCosmosRouterApi d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ yqg g;
    public final /* synthetic */ ajg h;

    public jmn0(tg8 tg8Var, kmn0 kmn0Var, obl oblVar, SharedCosmosRouterApi sharedCosmosRouterApi, boolean z, boolean z2, yqg yqgVar, ajg ajgVar) {
        this.a = tg8Var;
        this.b = kmn0Var;
        this.c = oblVar;
        this.d = sharedCosmosRouterApi;
        this.e = z;
        this.f = z2;
        this.g = yqgVar;
        this.h = ajgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Date date;
        tg8 tg8Var = this.a;
        di8 di8Var = tg8Var.a;
        di8 di8Var2 = tg8Var.a;
        UnencryptedCredentials unencryptedCredentials = new UnencryptedCredentials(di8Var.a, di8Var.c.b);
        imn0 imn0Var = NativeOAuthSetupImpl.Companion;
        Login5Configuration login5Configuration = new Login5Configuration();
        zym0 zym0Var = this.h;
        zym0Var.getClass();
        login5Configuration.setClientId("9a8d2f0ce77a4e248bb71fefcb557637");
        login5Configuration.setDeviceId(zym0Var.b);
        login5Configuration.setProtocolVersion(3);
        kmn0 kmn0Var = this.b;
        NativeTimerManagerThreadImpl nativeTimerManagerThreadImpl = kmn0Var.a.a;
        mcl mclVar = this.c;
        NativeLogin5SetupImpl nativeLogin5SetupImpl = mclVar.O0;
        if (nativeLogin5SetupImpl == null) {
            u890.C("nativeLogin5Setup");
            throw null;
        }
        AccessToken accessToken = new AccessToken();
        accessToken.setTokenType("Bearer");
        wd wdVar = di8Var2.b;
        if (wdVar == null || (str = wdVar.b) == null) {
            str = "";
        }
        accessToken.setAccessToken(str);
        wd wdVar2 = di8Var2.b;
        accessToken.setExpiresAt(((wdVar2 == null || (date = wdVar2.c) == null) ? 0L : date.getTime()) / 1000);
        NativeRouter nativeRouter = this.d.getNativeRouter();
        NativeApplicationScope nativeApplicationScopeA = mclVar.a();
        imn0Var.getClass();
        kmn0Var.c = NativeOAuthSetupImpl.create(login5Configuration, nativeTimerManagerThreadImpl, nativeLogin5SetupImpl, accessToken, unencryptedCredentials, nativeRouter, nativeApplicationScopeA, this.e, this.f);
        kmn0Var.d = new d520(new be(new SchedulingTransport(kmn0Var.b.a, kmn0Var.a().getNativeTransport())), tg8Var, this.g);
    }
}
