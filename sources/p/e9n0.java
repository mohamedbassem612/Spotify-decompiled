package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e9n0 implements zqw {
    public final String a;
    public final otp b;
    public final aa3 c = new aa3(this);
    public final zem0 d = new zem0(this, (byte) 20);

    public e9n0(String str, otp otpVar) {
        this.a = str;
        this.b = otpVar;
    }

    @Override // p.zqw
    public final m381 c() {
        return this.c;
    }

    @Override // p.zqw
    public final boolean d(hwq hwqVar) {
        Set set = s4b1.f;
        return uic.x(hwqVar.g.getUri()).c == blc0.ti && Boolean.parseBoolean((String) hwqVar.f.c.get("is_video_first"));
    }

    @Override // p.zqw
    public final Function0 e() {
        return this.d;
    }
}
