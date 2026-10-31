package app.p000rive.runtime.kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RiveTextureView$activity$2 extends hab0 implements Function0 {
    final /* synthetic */ RiveTextureView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveTextureView$activity$2(RiveTextureView riveTextureView) {
        super(0);
        this.this$0 = riveTextureView;
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Activity m477invoke() {
        Context context = this.this$0.getContext();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                context.getClass();
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        context = null;
        context.getClass();
        return (Activity) context;
    }
}
