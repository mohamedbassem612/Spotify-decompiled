package p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t800 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LayoutInflater b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t800(LayoutInflater layoutInflater, ViewGroup viewGroup, byte b) {
        super(0);
        this.a = b;
        this.b = layoutInflater;
        this.c = viewGroup;
    }

    public final Object invoke() {
        byte b = this.a;
        ViewGroup viewGroup = this.c;
        LayoutInflater layoutInflater = this.b;
        switch (b) {
            case 0:
                return (ViewGroup) layoutInflater.inflate(2131624645, viewGroup, false);
            case 1:
                return (ViewGroup) layoutInflater.inflate(2131625447, viewGroup, false);
            default:
                return layoutInflater.inflate(2131624702, viewGroup, false);
        }
    }
}
