package p;

import android.app.ActivityManager;
import android.os.Build;
import android.os.PowerManager;
import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class trw0 implements xgn {
    public final /* synthetic */ byte a = 0;
    public final int b;
    public final hab0 c;

    public trw0(PowerManager powerManager) {
        int i = Build.VERSION.SDK_INT;
        mfe1 mfe1Var = new mfe1(powerManager);
        this.b = i;
        this.c = mfe1Var;
    }

    public final List a() {
        srw0 m231Var;
        srw0 srw0Var;
        String str;
        byte b = this.a;
        hab0 hab0Var = this.c;
        String strValueOf = "unsupported";
        int i = this.b;
        switch (b) {
            case 0:
                if (i >= 35) {
                    try {
                        m231Var = (srw0) ((rrw0) hab0Var).invoke();
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    srw0Var = m231Var;
                    break;
                } else {
                    srw0Var = null;
                }
                if (i < 35) {
                    str = "unsupported";
                } else if (srw0Var != null) {
                    switch (srw0Var.a) {
                        case 0:
                            str = "alarm";
                            break;
                        case 1:
                            str = "backup";
                            break;
                        case 2:
                            str = "boot_complete";
                            break;
                        case 3:
                            str = "broadcast";
                            break;
                        case 4:
                            str = "content_provider";
                            break;
                        case 5:
                            str = "job";
                            break;
                        case 6:
                            str = "launcher";
                            break;
                        case 7:
                            str = "launcher_recents";
                            break;
                        case 8:
                            str = "other";
                            break;
                        case 9:
                            str = "push";
                            break;
                        case 10:
                            str = "service";
                            break;
                        case 11:
                            str = "start_activity";
                            break;
                        default:
                            str = "unknown";
                            break;
                    }
                } else {
                    str = "unavailable";
                }
                if (i >= 36) {
                    if ((srw0Var != null ? srw0Var.b : null) == null) {
                        strValueOf = "unavailable";
                    } else {
                        int iIntValue = srw0Var.b.intValue();
                        if (iIntValue == 1) {
                            strValueOf = "activity";
                        } else if (iIntValue == 2) {
                            strValueOf = "broadcast";
                        } else if (iIntValue == 3) {
                            strValueOf = "content_provider";
                        } else if (iIntValue != 4) {
                            strValueOf = iIntValue != 5 ? "unknown" : "other";
                        } else {
                            strValueOf = "service";
                        }
                    }
                }
                Logger.b("Start reason %s/%s", new Object[]{str, strValueOf});
                return p7h.M(new ugn[]{new agn(str), new zfn(strValueOf)});
            default:
                if (i >= 29) {
                    try {
                        Integer num = (Integer) ((mfe1) hab0Var).invoke();
                        if (num != null) {
                            int iIntValue2 = num.intValue();
                            switch (iIntValue2) {
                                case 0:
                                    strValueOf = "none";
                                    break;
                                case 1:
                                    strValueOf = "light";
                                    break;
                                case 2:
                                    strValueOf = "moderate";
                                    break;
                                case 3:
                                    strValueOf = "severe";
                                    break;
                                case 4:
                                    strValueOf = "critical";
                                    break;
                                case 5:
                                    strValueOf = "emergency";
                                    break;
                                case 6:
                                    strValueOf = "shutdown";
                                    break;
                                default:
                                    strValueOf = String.valueOf(iIntValue2);
                                    break;
                            }
                        } else {
                            strValueOf = "unavailable";
                        }
                    } catch (Throwable unused) {
                    }
                }
                return Collections.singletonList(new lgn(strValueOf));
        }
    }

    public trw0(ActivityManager activityManager) {
        int i = Build.VERSION.SDK_INT;
        rrw0 rrw0Var = new rrw0(activityManager);
        this.b = i;
        this.c = rrw0Var;
    }
}
