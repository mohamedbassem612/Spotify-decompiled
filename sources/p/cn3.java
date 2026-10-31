package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.allboarding.entrypoint.EntryPoint;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cn3 implements is31, z3x {
    public final Context a;

    public cn3(Context context) {
        this.a = context.getApplicationContext();
    }

    public void a(who1 who1Var) {
        ask askVar = new ask("EmojiCompatInitializer", (byte) 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingDeque(), (ThreadFactory) askVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new c45(this, who1Var, threadPoolExecutor, (byte) 16));
    }

    public void b(Intent intent, Uri... uriArr) {
        Context context = this.a;
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        for (Uri uri : uriArr) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                context.grantUriPermission(it.next().activityInfo.packageName, uri, 1);
            }
        }
    }

    public String c(ssp0 ssp0Var) {
        String string;
        int iC = l1d.C(ssp0Var.d);
        Context context = this.a;
        if (iC != 0) {
            switch (iC) {
                case 2:
                    string = context.getString(2131959367);
                    break;
                case 3:
                    string = context.getString(2131959368);
                    break;
                case 4:
                    string = context.getString(2131959369);
                    break;
                case 5:
                    string = context.getString(2131959369);
                    break;
                case 6:
                    string = context.getString(2131959369);
                    break;
                case 7:
                    string = context.getString(2131959370);
                    break;
                default:
                    string = "";
                    break;
            }
        } else {
            string = context.getString(2131959366);
        }
        string.getClass();
        return string;
    }

    public Intent f(Intent intent) {
        int i = AllboardingActivity.l1;
        Context context = this.a;
        context.getClass();
        return x2g0.z(context, EntryPoint.HOME_ARTIST_HEADER);
    }
}
