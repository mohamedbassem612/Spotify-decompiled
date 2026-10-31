package p;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nb90 extends hab0 implements vu30 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb90(ArrayList arrayList, String str, int i, float f, float f2, boolean z, boolean z2, int i2) {
        super(2);
        this.a = arrayList;
        this.b = str;
        this.c = i;
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        nln.k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(this.h | 1));
        return rih1.a;
    }
}
