package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lxp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ poj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lxp0(poj0 poj0Var, byte b) {
        super(0);
        this.a = b;
        this.b = poj0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        poj0 poj0Var = this.b;
        switch (b) {
            case 0:
                Context context = (Context) poj0Var.b;
                return PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) BulkRedownloadCancelReceiver.class), 201326592);
            default:
                Context context2 = (Context) poj0Var.b;
                return PendingIntent.getActivity(context2, 0, ((xs80) poj0Var.c).a(context2), 67108864);
        }
    }
}
