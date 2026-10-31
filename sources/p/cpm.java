package p;

import android.content.Context;
import android.os.Build;
import com.spotify.appstorage.userdirectory.UserDirectoryCachePaths;
import com.spotify.connectivity.AuthenticatedScopeConfiguration;
import com.spotify.connectivity.WebgateUserAgentPlatform;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.contribution.repositoryimpl.f;
import com.spotify.contribution.repositoryimpl.g;
import com.spotify.core.corefullimpl.FullAuthenticatedScopeConfiguration;
import com.spotify.core.coreimpl.ApplicationScopeConfiguration;
import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class cpm implements jly0 {
    public static oqm A(u8p u8pVar) {
        return new oqm(u8pVar.b());
    }

    public static lpd B(ozp ozpVar) {
        return new lpd(ozpVar, (byte) 29);
    }

    public static lpd C(rzp rzpVar) {
        return new lpd(rzpVar, (byte) 28);
    }

    public static UserDirectoryCachePaths D(ApplicationScopeConfiguration applicationScopeConfiguration) {
        return new UserDirectoryCachePaths(applicationScopeConfiguration.getCachePath(), applicationScopeConfiguration.getSettingsPath());
    }

    public static u8p a(vi2 vi2Var) {
        return new u8p(vi2Var);
    }

    public static odc b(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 15);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static dsm c(jo80 jo80Var, jly0 jly0Var, kly0 kly0Var) {
        dsm dsmVar = new dsm();
        dsmVar.a = jo80Var;
        dsmVar.b = jly0Var;
        dsmVar.c = kly0Var;
        return dsmVar;
    }

    public static wsm d(jo80 jo80Var, jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var) {
        wsm wsmVar = new wsm();
        wsmVar.a = jly0Var;
        wsmVar.b = kly0Var;
        wsmVar.c = jo80Var;
        wsmVar.d = jly0Var2;
        return wsmVar;
    }

    public static ctm e(caq caqVar, jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var, kly0 kly0Var2) {
        ctm ctmVar = new ctm();
        ctmVar.a = jly0Var;
        ctmVar.b = jly0Var2;
        ctmVar.c = caqVar;
        ctmVar.d = kly0Var;
        ctmVar.e = kly0Var2;
        return ctmVar;
    }

    public static gtm f(jly0 jly0Var, kly0 kly0Var, caq caqVar) {
        gtm gtmVar = new gtm();
        gtmVar.a = jly0Var;
        gtmVar.b = kly0Var;
        gtmVar.c = caqVar;
        return gtmVar;
    }

    public static ntm g(jly0 jly0Var, jly0 jly0Var2, caq caqVar, jly0 jly0Var3, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3) {
        ntm ntmVar = new ntm();
        ntmVar.a = jly0Var;
        ntmVar.b = jly0Var2;
        ntmVar.c = caqVar;
        ntmVar.d = jly0Var3;
        ntmVar.e = kly0Var;
        ntmVar.f = kly0Var2;
        ntmVar.g = kly0Var3;
        return ntmVar;
    }

    public static xtm h(jly0 jly0Var, kly0 kly0Var, caq caqVar) {
        xtm xtmVar = new xtm();
        xtmVar.a = jly0Var;
        xtmVar.b = kly0Var;
        xtmVar.c = caqVar;
        return xtmVar;
    }

    public static odc i(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 16);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static odc j(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 17);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static odc k(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 18);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static odc l(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 19);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static odc m(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 20);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static u9c0 n() {
        return cto1.q(krw0.i);
    }

    public static AuthenticatedScopeConfiguration o(Context context, ajg ajgVar, ApplicationScopeConfiguration applicationScopeConfiguration, jqt jqtVar) {
        String cachePath = applicationScopeConfiguration.getCachePath();
        String strZ = upn1.z(upn1.n(context));
        String id = TimeZone.getDefault().getID();
        zym0 zym0Var = (zym0) ajgVar;
        String strE = zym0Var.e();
        String strA = jqtVar.a();
        String strA2 = zym0Var.a();
        AuthenticatedScopeConfiguration authenticatedScopeConfiguration = new AuthenticatedScopeConfiguration();
        authenticatedScopeConfiguration.setClientVersionLong(strE);
        authenticatedScopeConfiguration.setCachePath(cachePath);
        authenticatedScopeConfiguration.setClientId("9a8d2f0ce77a4e248bb71fefcb557637");
        authenticatedScopeConfiguration.setDeviceId(strA);
        authenticatedScopeConfiguration.setWebgateLocale(strZ);
        authenticatedScopeConfiguration.setWebgateTimeZone(id);
        authenticatedScopeConfiguration.setWebgateUserAgentParameterAppVersion(strA2);
        authenticatedScopeConfiguration.setWebgateUserAgentParameterAppPlatform(WebgateUserAgentPlatform.android());
        authenticatedScopeConfiguration.setWebgateUserAgentParameterOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        authenticatedScopeConfiguration.setWebgateUserAgentParameterExtraInformation(Build.MODEL);
        return authenticatedScopeConfiguration;
    }

    public static gpm p(u8p u8pVar) {
        vi2 vi2Var = u8pVar.a;
        return new gpm((q8n) vi2Var.b.get(), (q8n) vi2Var.c.get(), u8pVar.a(), u8pVar.c());
    }

    public static w60 q(u8p u8pVar) {
        return u8pVar.b();
    }

    public static opm r(u8p u8pVar) {
        qpm qpmVar = (qpm) eth.z((xm41) u8pVar.a.d.get(), afm.d1);
        return qpmVar != null ? qpmVar : vbo0.a;
    }

    public static gqm s(u8p u8pVar) {
        gqm gqmVar = (gqm) eth.z((xm41) u8pVar.a.d.get(), afm.e1);
        return gqmVar == null ? wbo0.a : gqmVar;
    }

    public static f t(u8p u8pVar) {
        return u8pVar.a();
    }

    public static urm u(u8p u8pVar) {
        return u8pVar.c();
    }

    public static hum v(u8p u8pVar) {
        hum humVar = (hum) u8pVar.b.get();
        c8o.m(humVar);
        return humVar;
    }

    public static oum w(u8p u8pVar) {
        return new oum(new hm4(false, false, false, false, false, false, false, false, (luk) u8pVar.a.g.get()));
    }

    public static f x(u8p u8pVar) {
        return u8pVar.a();
    }

    public static FullAuthenticatedScopeConfiguration y(Context context, ajg ajgVar, ApplicationScopeConfiguration applicationScopeConfiguration, jqt jqtVar, j0u j0uVar) {
        String settingsPath = applicationScopeConfiguration.getSettingsPath();
        String cachePath = applicationScopeConfiguration.getCachePath();
        String strZ = upn1.z(upn1.n(context));
        String strA = jqtVar.a();
        String strE = upf.e(context);
        String str = Build.MODEL;
        String str2 = Build.BRAND;
        g0u g0uVar = j0uVar.a;
        FullAuthenticatedScopeConfiguration fullAuthenticatedScopeConfiguration = new FullAuthenticatedScopeConfiguration();
        fullAuthenticatedScopeConfiguration.setCachePath(cachePath);
        fullAuthenticatedScopeConfiguration.setVolatileCachePath((String) null);
        fullAuthenticatedScopeConfiguration.setSettingsPath(settingsPath);
        ((zym0) ajgVar).getClass();
        fullAuthenticatedScopeConfiguration.setVersionNumber(v7n0.b);
        fullAuthenticatedScopeConfiguration.setVersionName(((zym0) ajgVar).e());
        fullAuthenticatedScopeConfiguration.setDeviceId(strA);
        fullAuthenticatedScopeConfiguration.setClientId("9a8d2f0ce77a4e248bb71fefcb557637");
        fullAuthenticatedScopeConfiguration.setNativeBundleId("full");
        fullAuthenticatedScopeConfiguration.setDeviceName(strE);
        fullAuthenticatedScopeConfiguration.setDescription("android");
        fullAuthenticatedScopeConfiguration.setDescriptionShort("android");
        fullAuthenticatedScopeConfiguration.setModel(str);
        fullAuthenticatedScopeConfiguration.setBrand(str2);
        fullAuthenticatedScopeConfiguration.setDeviceType(g0uVar.ordinal());
        fullAuthenticatedScopeConfiguration.setVolumeSteps(32);
        fullAuthenticatedScopeConfiguration.setDeviceModelName(WebgateUserAgentPlatform.android());
        fullAuthenticatedScopeConfiguration.setVideoRendererAvailable(true);
        fullAuthenticatedScopeConfiguration.setEnableRemoteSleepTimer(true);
        fullAuthenticatedScopeConfiguration.setLocale(strZ);
        return fullAuthenticatedScopeConfiguration;
    }

    public static g z(u8p u8pVar) {
        return new g((cqm) ((RetrofitMaker) u8pVar.a.f.get()).createWebgateService(cqm.class, "android-contribution-repositoryimpl"));
    }
}
