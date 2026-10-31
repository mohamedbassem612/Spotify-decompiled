package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nm implements Consumer {
    public final /* synthetic */ byte a;
    public static final nm b = new nm(0);
    public static final nm c = new nm(1);
    public static final nm d = new nm(2);
    public static final nm e = new nm(3);
    public static final nm f = new nm(4);
    public static final nm g = new nm(5);
    public static final nm h = new nm(6);
    public static final nm i = new nm(7);
    public static final nm t = new nm(8);
    public static final nm X = new nm(9);
    public static final nm Y = new nm(10);
    public static final nm Z = new nm(11);
    public static final nm N0 = new nm(12);
    public static final nm O0 = new nm(13);
    public static final nm P0 = new nm(14);
    public static final nm Q0 = new nm(15);
    public static final nm R0 = new nm(16);
    public static final nm S0 = new nm(17);
    public static final nm T0 = new nm(18);
    public static final nm U0 = new nm(19);
    public static final nm V0 = new nm(20);
    public static final nm W0 = new nm(21);
    public static final nm X0 = new nm(22);
    public static final nm Y0 = new nm(23);
    public static final nm Z0 = new nm(24);
    public static final nm a1 = new nm(25);
    public static final nm b1 = new nm(26);
    public static final nm c1 = new nm(27);
    public static final nm d1 = new nm(28);
    public static final nm e1 = new nm(29);

    public /* synthetic */ nm(byte b2) {
        this.a = b2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                Logger.e(th, th.getMessage(), new Object[0]);
                break;
            case 1:
                ((nhv) obj).toString();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                Logger.e((Throwable) obj, "Error creating new session", new Object[0]);
                break;
            case 5:
                break;
            case 6:
                Logger.d(l1d.m("Failed to add to queue: ", ((Throwable) obj).getMessage()), new Object[0]);
                break;
            case 7:
                break;
            case 8:
                n57.e(((Throwable) obj).getMessage());
                break;
            case 9:
                Logger.e((Throwable) obj, "Failed calling change list", new Object[0]);
                break;
            case 10:
                Logger.e((Throwable) obj, "Failed changing a playlist", new Object[0]);
                break;
            case 11:
                Logger.e((Throwable) obj, "Failed getting playlist image background", new Object[0]);
                break;
            case 12:
                an5.e.compareAndSet(1, 0);
                Logger.e((Throwable) obj, "error executing AppExitReasonReporterDaemon", new Object[0]);
                break;
            case 13:
                Logger.e((Throwable) obj, "App language sync failed", new Object[0]);
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                jx7 jx7Var = (jx7) obj;
                hma1 hma1VarEdit = jx7Var.a.edit();
                hma1VarEdit.a(jx7Var.b.a, true);
                hma1VarEdit.h();
                break;
            case 17:
                n57.e(((Throwable) obj).toString());
                break;
            case 18:
                n57.e(((Throwable) obj).toString());
                break;
            case 19:
                n57.e(((Throwable) obj).toString());
                break;
            case 20:
                ((Throwable) obj).getMessage();
                break;
            case 21:
                n57.t("Failed to load author data for context menu", (Throwable) obj);
                break;
            case 22:
                n57.t("Failed to load metadata for context menu", (Throwable) obj);
                break;
            case 23:
                n57.t("Failed to load metadata for available releases", (Throwable) obj);
                break;
            case 24:
                n57.e("[Puffin] Error applying filters: " + ((Throwable) obj));
                break;
            case 25:
                Logger.e((Throwable) obj, "[Puffin] Error downloading filters", new Object[0]);
                break;
            case 26:
                break;
            case 27:
                Logger.l((Throwable) obj, "Error reprocessing media", new Object[0]);
                break;
            case 28:
                Logger.e((Throwable) obj, "Error when trying to rename Blend", new Object[0]);
                break;
            default:
                break;
        }
    }
}
