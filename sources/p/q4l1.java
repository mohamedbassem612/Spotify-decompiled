package p;

import com.spotify.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q4l1 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ byte[] d;

    public /* synthetic */ q4l1(String str, String str2, byte[] bArr, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = bArr;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        byte[] bArr = this.d;
        String str = this.c;
        String str2 = this.b;
        switch (b) {
            case 0:
                return ((Transport) obj).callSingle(str2, str, bArr).toObservable();
            default:
                return ((Transport) obj).callStream(str2, str, bArr);
        }
    }
}
