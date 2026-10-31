package p;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bko0 extends glo0 {
    public IconCompat e;
    public IconCompat f;
    public boolean g;
    public boolean h;

    public static IconCompat f(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            PorterDuff.Mode mode = IconCompat.k;
            return xzo1.j((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.d((Bitmap) parcelable);
        }
        return null;
    }

    @Override // p.glo0
    public final void b(fdc fdcVar) {
        Bitmap bitmapB;
        Notification.Builder builder = (Notification.Builder) fdcVar.d;
        Context context = (Context) fdcVar.c;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(this.b);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                ako0.a(bigContentTitle, xzo1.v(iconCompat, context));
            } else if (iconCompat.j() == 1) {
                IconCompat iconCompat2 = this.e;
                int i = iconCompat2.a;
                if (i == -1) {
                    Object obj = iconCompat2.b;
                    bitmapB = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapB = (Bitmap) iconCompat2.b;
                } else {
                    if (i != 5) {
                        bhn0.A(iconCompat2, "called getBitmap() on ");
                        return;
                    }
                    bitmapB = IconCompat.b((Bitmap) iconCompat2.b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapB);
            }
        }
        if (this.g) {
            IconCompat iconCompat3 = this.f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(xzo1.v(iconCompat3, context));
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            ako0.c(bigContentTitle, this.h);
            ako0.b(bigContentTitle, null);
        }
    }

    @Override // p.glo0
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // p.glo0
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f = f(bundle.getParcelable("android.largeIcon.big"));
            this.g = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.e = parcelable != null ? f(parcelable) : f(bundle.getParcelable("android.pictureIcon"));
        this.h = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }

    public final void g() {
        this.f = null;
        this.g = true;
    }

    public final void h(Bitmap bitmap) {
        this.e = bitmap == null ? null : IconCompat.d(bitmap);
    }
}
