package p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sp7 extends ContentObserver {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp7(ssw0 ssw0Var, pe peVar, tjs0 tjs0Var, Handler handler) {
        super(handler);
        this.b = ssw0Var;
        this.c = peVar;
        this.d = tjs0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                tp7 tp7Var = (tp7) obj;
                List listG = tp7Var.g();
                Context context = (Context) tp7Var.b;
                po7 po7Var = (po7) tp7Var.k;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) tp7Var.j;
                bg11 bg11Var = qp7.e;
                tp7Var.h(qp7.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), po7Var, audioDeviceInfo, listG));
                break;
            default:
                ((ssw0) this.b).l(Boolean.valueOf(pwo1.v((pe) this.c, (tjs0) obj)));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp7(tp7 tp7Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.d = tp7Var;
        this.b = contentResolver;
        this.c = uri;
    }
}
