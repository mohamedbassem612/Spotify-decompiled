package p;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import app.p000rive.runtime.kotlin.R;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gko0 extends glo0 {
    public int e;
    public mrs0 f;
    public PendingIntent g;
    public PendingIntent h;
    public PendingIntent i;
    public boolean j;
    public Integer k;
    public Integer l;
    public IconCompat m;
    public CharSequence n;

    @Override // p.glo0
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.e);
        bundle.putBoolean("android.callIsVideo", this.j);
        mrs0 mrs0Var = this.f;
        if (mrs0Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", eko0.b(rh5.c(mrs0Var)));
            } else {
                bundle.putParcelable("android.callPersonCompat", mrs0Var.i());
            }
        }
        IconCompat iconCompat = this.m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", xzo1.v(iconCompat, this.a.a));
        }
        bundle.putCharSequence("android.verificationText", this.n);
        bundle.putParcelable("android.answerIntent", this.g);
        bundle.putParcelable("android.declineIntent", this.h);
        bundle.putParcelable("android.hangUpIntent", this.i);
        Integer num = this.k;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.l;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // p.glo0
    public final void b(fdc fdcVar) {
        Notification.Builder builder = (Notification.Builder) fdcVar.d;
        int i = Build.VERSION.SDK_INT;
        String string = null;
        callStyleA = null;
        Notification.CallStyle callStyleA = null;
        if (i < 31) {
            mrs0 mrs0Var = this.f;
            builder.setContentTitle(mrs0Var != null ? mrs0Var.a : null);
            Bundle bundle = this.a.t;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.a.t.getCharSequence("android.text");
            if (charSequence == null) {
                int i2 = this.e;
                if (i2 == 1) {
                    string = this.a.a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i2 == 2) {
                    string = this.a.a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i2 == 3) {
                    string = this.a.a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            mrs0 mrs0Var2 = this.f;
            if (mrs0Var2 != null) {
                IconCompat iconCompat = mrs0Var2.b;
                if (iconCompat != null) {
                    builder.setLargeIcon(xzo1.v(iconCompat, this.a.a));
                }
                mrs0 mrs0Var3 = this.f;
                if (i >= 28) {
                    mrs0Var3.getClass();
                    eko0.a(builder, rh5.c(mrs0Var3));
                } else {
                    builder.addPerson(mrs0Var3.c);
                }
            }
            builder.setCategory("call");
            return;
        }
        int i3 = this.e;
        if (i3 == 1) {
            mrs0 mrs0Var4 = this.f;
            mrs0Var4.getClass();
            callStyleA = fko0.a(rh5.c(mrs0Var4), this.h, this.g);
        } else if (i3 == 2) {
            mrs0 mrs0Var5 = this.f;
            mrs0Var5.getClass();
            callStyleA = fko0.b(rh5.c(mrs0Var5), this.i);
        } else if (i3 == 3) {
            mrs0 mrs0Var6 = this.f;
            mrs0Var6.getClass();
            callStyleA = fko0.c(rh5.c(mrs0Var6), this.i, this.g);
        } else if (Log.isLoggable("NotifCompat", 3)) {
            String.valueOf(this.e);
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(builder);
            Integer num = this.k;
            if (num != null) {
                fko0.d(callStyleA, num.intValue());
            }
            Integer num2 = this.l;
            if (num2 != null) {
                fko0.e(callStyleA, num2.intValue());
            }
            fko0.h(callStyleA, this.n);
            IconCompat iconCompat2 = this.m;
            if (iconCompat2 != null) {
                fko0.g(callStyleA, xzo1.v(iconCompat2, this.a.a));
            }
            fko0.f(callStyleA, this.j);
        }
    }

    @Override // p.glo0
    public final String d() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // p.glo0
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.e = bundle.getInt("android.callType");
        this.j = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.f = rh5.a((Person) bundle.getParcelable("android.callPerson"));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f = mrs0.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            Icon icon = (Icon) bundle.getParcelable("android.verificationIcon");
            PorterDuff.Mode mode = IconCompat.k;
            this.m = xzo1.j(icon);
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.m = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
        }
        this.n = bundle.getCharSequence("android.verificationText");
        this.g = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.h = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.k = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.l = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    public final xjo0 f(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(this.a.a.getColor(i3));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.a.a.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        xjo0 xjo0VarB = new w0d(IconCompat.f(this.a.a, i), spannableStringBuilder, pendingIntent, new Bundle()).b();
        xjo0VarB.a.putBoolean("key_action_priority", true);
        return xjo0VarB;
    }
}
