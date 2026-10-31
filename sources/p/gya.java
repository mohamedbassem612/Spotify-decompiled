package p;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gya implements eya {
    public final Context a;
    public final fya b;
    public final uf0 c;
    public final q8n d;
    public final y1t0 e;
    public final mjv f;

    public gya(Context context, fya fyaVar, uf0 uf0Var, q8n q8nVar, y1t0 y1t0Var, mjv mjvVar) {
        this.a = context;
        this.b = fyaVar;
        this.c = uf0Var;
        this.d = q8nVar;
        this.e = y1t0Var;
        this.f = mjvVar;
    }

    public static Uri b(ContentResolver contentResolver, ContentValues contentValues) {
        return contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
    }
}
