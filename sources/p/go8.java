package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class go8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ucm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go8(String str, ucm ucmVar, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.c = ucmVar;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = this.b;
                return new gcm(str, str, this.c, (Function0) null, 24);
            default:
                return new wcm((String) obj, (String) null, this.b, this.c, (Function0) null, oxx.R0, false, (String) null, (String) null, 978);
        }
    }
}
