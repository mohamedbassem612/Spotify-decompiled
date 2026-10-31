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
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class flo0 extends glo0 {
    public boolean h;
    public IconCompat j;
    public IconCompat k;
    public IconCompat l;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public int g = 0;
    public boolean i = true;

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
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (Build.VERSION.SDK_INT <= 36) {
            ArrayList arrayList = this.e;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    elo0 elo0Var = (elo0) arrayList.get(i);
                    if (elo0Var.a > 0) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("length", elo0Var.a);
                        bundle2.putInt("id", elo0Var.b);
                        bundle2.putInt("colorInt", elo0Var.c);
                        bundle2.putInt("semanticStyle", elo0Var.d);
                        arrayList2.add(bundle2);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressSegments", arrayList2);
            ArrayList arrayList3 = this.f;
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
            if (!arrayList3.isEmpty()) {
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    dlo0 dlo0Var = (dlo0) arrayList3.get(i2);
                    if (dlo0Var.a >= 0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("position", dlo0Var.a);
                        bundle3.putInt("id", dlo0Var.b);
                        bundle3.putInt("colorInt", dlo0Var.c);
                        bundle3.putInt("semanticStyle", dlo0Var.d);
                        arrayList4.add(bundle3);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressPoints", arrayList4);
        }
        if (Build.VERSION.SDK_INT < 36) {
            bundle.putInt("android.progress", this.g);
            bundle.putBoolean("android.progressIndeterminate", this.h);
            bundle.putInt("android.progressMax", g());
            bundle.putBoolean("android.styledByProgress", this.i);
            dko0 dko0Var = this.a;
            Context context = dko0Var != null ? dko0Var.a : null;
            if (context == null) {
                return;
            }
            IconCompat iconCompat = this.j;
            if (iconCompat != null) {
                bundle.putParcelable("android.progressTrackerIcon", xzo1.v(iconCompat, context));
            } else {
                bundle.remove("android.progressTrackerIcon");
            }
            IconCompat iconCompat2 = this.k;
            if (iconCompat2 != null) {
                bundle.putParcelable("android.progressStartIcon", xzo1.v(iconCompat2, context));
            } else {
                bundle.remove("android.progressStartIcon");
            }
            IconCompat iconCompat3 = this.l;
            if (iconCompat3 != null) {
                bundle.putParcelable("android.progressEndIcon", xzo1.v(iconCompat3, context));
            } else {
                bundle.remove("android.progressEndIcon");
            }
        }
    }

    @Override // p.glo0
    public final void b(fdc fdcVar) {
        Notification.Builder builder = (Notification.Builder) fdcVar.d;
        int i = Build.VERSION.SDK_INT;
        if (i < 36) {
            int iG = g();
            builder.setProgress(iG, Math.min(this.g, iG), this.h);
            return;
        }
        Context context = (Context) fdcVar.c;
        Notification.ProgressStyle progressStyle = new Notification.ProgressStyle();
        blo0.h(progressStyle, this.i);
        blo0.a(progressStyle, this.g);
        blo0.c(progressStyle, this.h);
        IconCompat iconCompat = this.k;
        blo0.f(progressStyle, iconCompat != null ? xzo1.v(iconCompat, context) : null);
        IconCompat iconCompat2 = this.l;
        blo0.b(progressStyle, iconCompat2 != null ? xzo1.v(iconCompat2, context) : null);
        IconCompat iconCompat3 = this.j;
        blo0.g(progressStyle, iconCompat3 != null ? xzo1.v(iconCompat3, context) : null);
        ArrayList arrayList = this.f;
        if (i >= 37) {
            clo0.a(progressStyle, arrayList);
            clo0.b(progressStyle, this.e);
        } else {
            blo0.d(progressStyle, arrayList);
            blo0.e(progressStyle, this.e);
        }
        builder.setStyle(progressStyle);
    }

    @Override // p.glo0
    public final String d() {
        return "androidx.core.app.NotificationCompat$ProgressStyle";
    }

    @Override // p.glo0
    public final void e(Bundle bundle) {
        super.e(bundle);
        ArrayList arrayListU = jhc1.u(bundle, "android.progressSegments", Bundle.class);
        ArrayList arrayList = new ArrayList();
        if (arrayListU != null && !arrayListU.isEmpty()) {
            for (int i = 0; i < arrayListU.size(); i++) {
                Bundle bundle2 = (Bundle) arrayListU.get(i);
                int i2 = bundle2.getInt("length");
                if (i2 > 0) {
                    int i3 = bundle2.getInt("id");
                    int i4 = bundle2.getInt("colorInt", 0);
                    int i5 = bundle2.getInt("semanticStyle", 0);
                    elo0 elo0Var = new elo0();
                    elo0Var.a = i2;
                    elo0Var.b = i3;
                    elo0Var.c = i4;
                    elo0Var.d = i5;
                    arrayList.add(elo0Var);
                }
            }
        }
        this.e = arrayList;
        this.g = bundle.getInt("android.progress", 0);
        this.h = bundle.getBoolean("android.progressIndeterminate", false);
        this.i = bundle.getBoolean("android.styledByProgress", true);
        ArrayList arrayListU2 = jhc1.u(bundle, "android.progressPoints", Bundle.class);
        ArrayList arrayList2 = new ArrayList();
        if (arrayListU2 != null && !arrayListU2.isEmpty()) {
            for (int i6 = 0; i6 < arrayListU2.size(); i6++) {
                Bundle bundle3 = (Bundle) arrayListU2.get(i6);
                int i7 = bundle3.getInt("position");
                if (i7 >= 0) {
                    int i8 = bundle3.getInt("id");
                    int i9 = bundle3.getInt("colorInt", 0);
                    int i10 = bundle3.getInt("semanticStyle", 0);
                    dlo0 dlo0Var = new dlo0();
                    dlo0Var.a = i7;
                    dlo0Var.b = i8;
                    dlo0Var.c = i9;
                    dlo0Var.d = i10;
                    arrayList2.add(dlo0Var);
                }
            }
        }
        this.f = arrayList2;
        this.j = f((Parcelable) jhc1.t(bundle, "android.progressTrackerIcon", Icon.class));
        this.k = f((Parcelable) jhc1.t(bundle, "android.progressStartIcon", Icon.class));
        this.l = f((Parcelable) jhc1.t(bundle, "android.progressEndIcon", Icon.class));
    }

    public final int g() {
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int i = 0;
            int iAddExact = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                int i3 = ((elo0) arrayList.get(i2)).a;
                if (i3 > 0) {
                    try {
                        iAddExact = Math.addExact(iAddExact, i3);
                        i++;
                    } catch (ArithmeticException unused) {
                        return 100;
                    }
                }
            }
            if (i != 0) {
                return iAddExact;
            }
        }
        return 100;
    }
}
