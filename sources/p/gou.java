package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gou extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gou(Context context, String str, byte b) {
        super(1);
        this.a = b;
        this.b = context;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        Context context = this.b;
        switch (b) {
            case 0:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return rih1Var;
            case 1:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return rih1Var;
            default:
                return FileProvider.getUriForFile(context, str, (File) obj);
        }
    }
}
