package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J1\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0019*\u0004\u0018\u00010\b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b\u001e\u0010)¨\u0006+"}, d2 = {"Lp/chs;", "Lp/xov0;", "Lp/ap40;", "getPropExecutor", "Lp/wov0;", "preloadFileUtil", "Lp/xdy0;", "propertyExtractor", "", "propKeyReferrer", "propKeyPartner", "Lio/reactivex/rxjava3/core/Scheduler;", "ioScheduler", "<init>", "(Lp/ap40;Lp/wov0;Lp/xdy0;Ljava/lang/String;Ljava/lang/String;Lio/reactivex/rxjava3/core/Scheduler;)V", "Lp/vov0;", "f", "()Lp/vov0;", "referrerPropertyKey", "partnerPropertyKey", "Lp/uov0;", "i", "(Ljava/lang/String;Ljava/lang/String;)Lp/uov0;", "h", "g", "T", "Lkotlin/Function1;", "block", "j", "(Ljava/lang/String;Lp/iu30;)Ljava/lang/Object;", "a", "Lp/ap40;", "b", "Lp/wov0;", "c", "Lp/xdy0;", "d", "Ljava/lang/String;", "e", "Lio/reactivex/rxjava3/core/Single;", "Lio/reactivex/rxjava3/core/Single;", "()Lio/reactivex/rxjava3/core/Single;", "preloadData", "src_main_java_com_spotify_preload_statusimpl-statusimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public class chs implements xov0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ap40 getPropExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final wov0 preloadFileUtil;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final xdy0 propertyExtractor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String propKeyReferrer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String propKeyPartner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Single<vov0> preloadData;

    public chs(ap40 ap40Var, wov0 wov0Var, xdy0 xdy0Var, String str, String str2, Scheduler scheduler) {
        this.getPropExecutor = ap40Var;
        this.preloadFileUtil = wov0Var;
        this.propertyExtractor = xdy0Var;
        this.propKeyReferrer = str;
        this.propKeyPartner = str2;
        this.preloadData = Single.fromCallable(new sra(this, (byte) 1)).subscribeOn(scheduler).cache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vov0 f() {
        uov0 uov0VarI = i(this.propKeyReferrer, this.propKeyPartner);
        if (uov0VarI != null) {
            return uov0VarI;
        }
        uov0 uov0VarH = h(this.propKeyReferrer, this.propKeyPartner);
        return uov0VarH != null ? uov0VarH : g();
    }

    private final vov0 g() {
        if (!this.preloadFileUtil.b()) {
            return tov0.a;
        }
        String strD = this.preloadFileUtil.d("partner");
        String strD2 = this.preloadFileUtil.d("referrer");
        boolean z = !nhc1.S(this.preloadFileUtil.d("allow_get_premium"), "false", true);
        strD.getClass();
        strD2.getClass();
        return new uov0(strD, strD2, z);
    }

    private final uov0 h(String referrerPropertyKey, String partnerPropertyKey) {
        return (uov0) j(((zov0) this.getPropExecutor).e(partnerPropertyKey), new d(this, referrerPropertyKey, (byte) 5));
    }

    private final uov0 i(String referrerPropertyKey, String partnerPropertyKey) {
        return (uov0) j(this.propertyExtractor.a(partnerPropertyKey), new y0o(this, referrerPropertyKey, (byte) 28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T j(String str, iu30 iu30Var) {
        if (str == null) {
            return null;
        }
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return (T) iu30Var.invoke(str);
        }
        return null;
    }

    @Override // p.xov0
    public Single<vov0> a() {
        return this.preloadData;
    }
}
