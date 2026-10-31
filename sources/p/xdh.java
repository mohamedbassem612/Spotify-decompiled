package p;

import androidx.media3.common.VideoFrameProcessingException;
import app.p000rive.core.CommandQueue;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class xdh implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xdh(CommandQueue commandQueue, long j, String str) {
        this.a = (byte) 0;
        this.c = commandQueue;
        this.b = j;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                CommandQueue.dispose$lambda$1((CommandQueue) obj2, j, (String) obj);
                break;
            case 1:
                ((d9r) obj2).g.a(VideoFrameProcessingException.a(j, (Exception) obj));
                break;
            case 2:
                ((cg20) obj2).j.a(VideoFrameProcessingException.a(j, (Exception) obj));
                break;
            case 3:
                lkw0 lkw0Var = (lkw0) obj2;
                u19 u19Var = (u19) obj;
                BehaviorSubject behaviorSubject = lkw0Var.k;
                w19 w19Var = w19.h;
                v19 v19Var = new v19();
                String str = u19Var.a;
                if (str == null) {
                    bhn0.i("Null previewId");
                } else {
                    v19Var.a = str;
                    String str2 = (String) u19Var.b.e("");
                    if (str2 == null) {
                        bhn0.i("Null previewKey");
                    } else {
                        v19Var.b = str2;
                        v19Var.c = false;
                        byte b2 = (byte) (v19Var.h | 1);
                        v19Var.d = false;
                        v19Var.h = (byte) (b2 | 2);
                        v19Var.e = Long.valueOf(j);
                        v19Var.f = Long.valueOf(j);
                        v19Var.g = Long.valueOf(lkw0Var.h.c());
                        behaviorSubject.onNext(v19Var.a());
                        lkw0Var.h(true, true);
                    }
                }
                break;
            default:
                qwj1 qwj1Var = (qwj1) ((bih1) obj2).c;
                String str3 = zoi1.a;
                qwj1Var.E(j, obj);
                break;
        }
    }

    public /* synthetic */ xdh(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
