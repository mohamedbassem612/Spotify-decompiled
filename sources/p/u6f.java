package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u6f extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6f(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                uey0 uey0VarW = oqo1.w((t6f) obj2, (s6f) obj, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
                n5f n5fVar = uey0VarW.b;
                t6f t6fVar = uey0VarW.a;
                return n5fVar != null ? Next.i(t6fVar, Collections.singleton(n5fVar)) : Next.h(t6fVar);
            default:
                uey0 uey0VarW2 = oqo1.w((t6f) obj2, (s6f) obj, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
                n5f n5fVar2 = uey0VarW2.b;
                t6f t6fVar2 = uey0VarW2.a;
                return n5fVar2 != null ? First.c(t6fVar2, Collections.singleton(n5fVar2)) : First.b(t6fVar2);
        }
    }
}
