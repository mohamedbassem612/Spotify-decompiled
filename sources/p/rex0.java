package p;

import android.app.ApplicationStartInfo;
import android.os.ProfilingResult;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class rex0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rex0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        String str;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((sex0) obj2).c((ProfilingResult) obj);
                break;
            default:
                ApplicationStartInfo applicationStartInfoB = uh61.b(obj);
                hlb1 hlb1Var = (hlb1) obj2;
                bpb1 bpb1Var = (wen0) hlb1Var.c.getValue();
                applicationStartInfoB.getClass();
                int startType = applicationStartInfoB.getStartType();
                String str2 = "unknown";
                if (startType == 0) {
                    str = "unset";
                } else if (startType == 1) {
                    str = "cold";
                } else if (startType != 2) {
                    str = startType != 3 ? "unknown" : "hot";
                } else {
                    str = "warm";
                }
                uen uenVar = new uen(str);
                bpb1 bpb1Var2 = bpb1Var;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, uenVar);
                bpb1 bpb1Var3 = (wen0) hlb1Var.d.getValue();
                switch (applicationStartInfoB.getReason()) {
                    case 0:
                        str2 = "alarm";
                        break;
                    case 1:
                        str2 = "backup";
                        break;
                    case 2:
                        str2 = "boot_complete";
                        break;
                    case 3:
                        str2 = "broadcast";
                        break;
                    case 4:
                        str2 = "content_provider";
                        break;
                    case 5:
                        str2 = "job";
                        break;
                    case 6:
                        str2 = "launcher";
                        break;
                    case 7:
                        str2 = "launcher_recents";
                        break;
                    case 8:
                        str2 = "other";
                        break;
                    case 9:
                        str2 = "push";
                        break;
                    case 10:
                        str2 = "service";
                        break;
                    case 11:
                        str2 = "start_activity";
                        break;
                }
                ten tenVar = new ten(str2);
                bpb1 bpb1Var4 = bpb1Var3;
                bpb1Var4.getClass();
                bpb1Var4.m((Object) null, tenVar);
                break;
        }
    }
}
