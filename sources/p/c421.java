package p;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c421 implements RemoteViewsService.RemoteViewsFactory {
    public static final b2c e;
    public final RemoteViewsCompatService a;
    public final int b;
    public final int c;
    public b2c d = e;

    static {
        long[] jArr = new long[0];
        RemoteViews[] remoteViewsArr = new RemoteViews[0];
        b2c b2cVar = new b2c();
        b2cVar.c = jArr;
        b2cVar.d = remoteViewsArr;
        b2cVar.b = false;
        b2cVar.a = 1;
        if (jArr.length != remoteViewsArr.length) {
            hhg1.n("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = o7h.j0(arrayList).size();
        if (size > 1) {
            hhg1.f(gvg.e(size, "View type count is set to 1, but the collection contains ", " different layout ids"));
            throw null;
        }
        e = b2cVar;
    }

    public c421(RemoteViewsCompatService remoteViewsCompatService, int i, int i2) {
        this.a = remoteViewsCompatService;
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        Long lValueOf;
        RemoteViewsCompatService remoteViewsCompatService = this.a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(':');
        sb.append(this.c);
        b2c b2cVar = null;
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string != null) {
            byte[] bArrDecode = Base64.decode(string, 0);
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcelObtain.setDataPosition(0);
                byte[] bArr = new byte[parcelObtain.readInt()];
                parcelObtain.readByteArray(bArr);
                String string2 = parcelObtain.readString();
                string2.getClass();
                long j = parcelObtain.readLong();
                parcelObtain.recycle();
                if (u890.j(Build.VERSION.INCREMENTAL, string2)) {
                    try {
                        PackageInfo packageInfo = remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0);
                        lValueOf = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? ph5.q(packageInfo) : packageInfo.versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        Objects.toString(remoteViewsCompatService.getPackageManager());
                        lValueOf = null;
                    }
                    if (lValueOf != null && lValueOf.longValue() == j) {
                        try {
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain2.unmarshall(bArr, 0, bArr.length);
                                parcelObtain2.setDataPosition(0);
                                b2c b2cVar2 = new b2c(parcelObtain2);
                                parcelObtain2.recycle();
                                b2cVar = b2cVar2;
                            } catch (Throwable th) {
                                parcelObtain2.recycle();
                                throw th;
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }
        if (b2cVar == null) {
            b2cVar = e;
        }
        this.d = b2cVar;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.d.c).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return ((long[]) this.d.c)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return ((RemoteViews[]) this.d.d)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.a.getPackageName(), 2131625096);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.d.a;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.d.b;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
