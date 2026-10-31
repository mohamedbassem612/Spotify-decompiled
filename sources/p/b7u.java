package p;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b7u implements xpw {
    public final /* synthetic */ byte a;
    public final Context b;
    public final rey0 c;
    public final ia00 d;
    public final psw e;

    public b7u(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = context;
                this.c = new rey0(new e9f1(this, (byte) 29));
                this.d = n3o1.q(this).a(ruh1.V0, new zbb1(this, (byte) 10));
                j2i j2iVar = bqj.a;
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = context;
                this.c = new rey0(new oat(this, (byte) 5));
                this.d = n3o1.q(this).a(h40.N0, v0t.W0);
                j2i j2iVar2 = mji.a;
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public static String e(String str, String str2, LatLng latLng) {
        return l1d.m(String.format("geo:%f,%f?q=", Arrays.copyOf(new Object[]{Double.valueOf(latLng.a), Double.valueOf(latLng.b)}, 2)), Uri.encode(str + ", " + str2));
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        return this.c;
    }
}
