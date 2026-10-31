package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p implements Consumer {
    public final /* synthetic */ byte a;
    public static final p b = new p(0);
    public static final p c = new p(1);
    public static final p d = new p(2);
    public static final p e = new p(3);
    public static final p f = new p(4);
    public static final p g = new p(5);
    public static final p h = new p(6);
    public static final p i = new p(7);
    public static final p t = new p(8);
    public static final p X = new p(9);
    public static final p Y = new p(10);
    public static final p Z = new p(11);
    public static final p N0 = new p(12);
    public static final p O0 = new p(13);
    public static final p P0 = new p(14);
    public static final p Q0 = new p(15);
    public static final p R0 = new p(16);
    public static final p S0 = new p(17);
    public static final p T0 = new p(18);
    public static final p U0 = new p(19);
    public static final p V0 = new p(20);
    public static final p W0 = new p(21);
    public static final p X0 = new p(22);
    public static final p Y0 = new p(23);
    public static final p Z0 = new p(24);
    public static final p a1 = new p(25);
    public static final p b1 = new p(26);
    public static final p c1 = new p(27);
    public static final p d1 = new p(28);
    public static final p e1 = new p(29);

    public /* synthetic */ p(byte b2) {
        this.a = b2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                n57.e(((Throwable) obj).toString());
                break;
            case 3:
                break;
            case 4:
                Logger.e((Throwable) obj, "Error fetching \"disable-blocked-content\" product state.", new Object[0]);
                break;
            case 5:
                lfb.a((Throwable) obj);
                break;
            case 6:
                Objects.toString((ypb) obj);
                break;
            case 7:
                break;
            case 8:
                bno1.k((Throwable) obj);
                break;
            case 9:
                Logger.e((Throwable) obj, "Error observing data saver enabled state", new Object[0]);
                break;
            case 10:
                Logger.d("Error when triggering active discovery on app start", (Throwable) obj);
                break;
            case 11:
                ((Boolean) obj).booleanValue();
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                n57.g("Error occurred while finding connected Go devices", (Throwable) obj);
                break;
            case 18:
                break;
            case 19:
                n57.t("Error when observing media-session playback state.", (Throwable) obj);
                break;
            case 20:
                break;
            case 21:
                Logger.e((Throwable) obj, "Couldn't retrieve partner userid", new Object[0]);
                break;
            case 22:
                twa.k((Throwable) obj);
                break;
            case 23:
                List<rsp0> list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (rsp0 rsp0Var : list) {
                    arrayList.add(cy30.p("Item: ", rsp0Var.a(), " (", rsp0Var.b(), ")"));
                }
                arrayList.toString();
                break;
            case 24:
                Logger.e((Throwable) obj, "Error while grabbing playback", new Object[0]);
                break;
            case 25:
                Logger.d(((Throwable) obj).getMessage(), new Object[0]);
                break;
            case 26:
                n57.t("QueuePermissionProvider: product state subscription terminated", (Throwable) obj);
                break;
            case 27:
                Logger.d(i3a.j("Received error from LoginUpdates API: ", (Throwable) obj), new Object[0]);
                break;
            case 28:
                Logger.g("Fetching Unauthenticated RC properties", new Object[0]);
                break;
            default:
                Logger.d(l1d.m("Resolver Async fetch attempt failed ", ((Throwable) obj).getMessage()), new Object[0]);
                break;
        }
    }
}
