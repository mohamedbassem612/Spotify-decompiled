package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.profile.profilelist.ProfileListPage;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wx91 implements Consumer {
    public final /* synthetic */ byte a;
    public static final wx91 b = new wx91(0);
    public static final wx91 c = new wx91(1);
    public static final wx91 d = new wx91(2);
    public static final wx91 e = new wx91(3);
    public static final wx91 f = new wx91(4);
    public static final wx91 g = new wx91(5);
    public static final wx91 h = new wx91(6);
    public static final wx91 i = new wx91(7);
    public static final wx91 t = new wx91(8);
    public static final wx91 X = new wx91(9);
    public static final wx91 Y = new wx91(10);

    public /* synthetic */ wx91(byte b2) {
        this.a = b2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.profile.profilelist.ProfileListPage$FailLoadingProfileListException */
    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) throws ProfileListPage.FailLoadingProfileListException {
        switch (this.a) {
            case 0:
                return;
            case 1:
                Logger.e((Throwable) obj, "social listening impl: Failed observing current user from session state.", new Object[0]);
                return;
            case 2:
                return;
            case 3:
                Logger.e((Throwable) obj, "Failed to broadcast remote intent.", new Object[0]);
                return;
            case 4:
                Logger.e((Throwable) obj, "Couldn't set Spotify cookies", new Object[0]);
                return;
            case 5:
                Logger.e((Throwable) obj, "NavLoggerPageHeartBeat failed.", new Object[0]);
                return;
            case 6:
                Logger.e((Throwable) obj, "Got error observing session updates.", new Object[0]);
                return;
            case 7:
                utw0 utw0Var = ike1.a;
                utw0Var.y("RCS");
                utw0Var.q("Failure when fetching unauth properties", new Object[]{(Throwable) obj});
                return;
            case 8:
                iu30 iu30VarA = ((lrk1) obj).a.a();
                if (iu30VarA != null) {
                    iu30VarA.invoke(Boolean.TRUE);
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                Logger.d(l1d.m("YourUpdatesLoggedInLifecyclePluginImpl: Refreshing Your Updates BadgingState terminated: ", ((Throwable) obj).getMessage()), new Object[0]);
                return;
            case 11:
                return;
            case 12:
                return;
            case 13:
                Logger.d("Failed to render Marquee ad, error: %s", new Object[]{((wwg0) obj).c});
                return;
            case 14:
                z9m0 z9m0Var = (z9m0) obj;
                z9m0Var.f.onNext(z9m0Var.e);
                return;
            default:
                if (((j8x0) obj).b() == 4) {
                    throw new ProfileListPage.FailLoadingProfileListException();
                }
                return;
        }
    }

    private final void a(Object obj) {
    }
}
