package p;

import android.view.ViewTreeObserver;
import android.widget.EditText;
import io.reactivex.rxjava3.core.FlowableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zqi1 implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zqi1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                EditText editText = (EditText) obj;
                if (z) {
                    if (editText.isFocused()) {
                        editText.post(new seg1(editText, (byte) 2));
                    }
                    editText.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                }
                break;
            case 1:
                ((FlowableEmitter) obj).onNext(Boolean.valueOf(z));
                break;
            default:
                ((ssw0) obj).l(Boolean.valueOf(z));
                break;
        }
    }
}
