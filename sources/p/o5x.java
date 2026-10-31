package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.emoji2.emojipicker.EmojiView;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o5x extends w611 {
    public final r2a1 U0;
    public final k4x V0;
    public final k4x W0;
    public final n5x X0;
    public final EmojiView Y0;
    public p5x Z0;
    public otu a1;

    /* JADX WARN: Type inference failed for: r7v1, types: [p.n5x] */
    public o5x(final Context context, int i, int i2, r2a1 r2a1Var, k4x k4xVar, k4x k4xVar2) {
        AttributeSet attributeSet = null;
        EmojiView emojiView = new EmojiView(context, attributeSet, 2, attributeSet);
        super(emojiView);
        this.U0 = r2a1Var;
        this.V0 = k4xVar;
        this.W0 = k4xVar2;
        this.X0 = new View.OnLongClickListener() { // from class: p.n5x
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                view.getClass();
                o5x o5xVar = this.a;
                p5x p5xVar = o5xVar.Z0;
                if (p5xVar == null) {
                    u890.C("emojiViewItem");
                    throw null;
                }
                p4x p4xVar = new p4x(o5xVar, view, (byte) 1);
                Context context2 = context;
                v4x v4xVar = new v4x(context2, view, p5xVar, p4xVar);
                otu otuVar = new otu(context2, v4xVar, view);
                o5xVar.a1 = otuVar;
                PopupWindow popupWindow = (PopupWindow) otuVar.c;
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                float width = ((view.getWidth() / 2.0f) + iArr[0]) - (v4xVar.getPopupViewWidth() / 2.0f);
                int popupViewHeight = iArr[1] - v4xVar.getPopupViewHeight();
                popupWindow.setBackgroundDrawable(context2.getDrawable(2131233770));
                popupWindow.setOutsideTouchable(true);
                popupWindow.setTouchable(true);
                popupWindow.setAnimationStyle(2132018435);
                popupWindow.setElevation(view.getContext().getResources().getDimensionPixelSize(2131165709));
                try {
                    popupWindow.showAtLocation(view, 0, jch0.U(width), popupViewHeight);
                    return true;
                } catch (WindowManager.BadTokenException unused) {
                    Toast.makeText(context2, "Don't use EmojiPickerView inside a Popup", 1).show();
                    return true;
                }
            }
        };
        emojiView.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        emojiView.setClickable(true);
        emojiView.setOnClickListener(new kpt((Object) this, (byte) 1));
        this.Y0 = emojiView;
    }

    public static p5x E(String str) {
        LinkedHashMap linkedHashMap = uwg.Q0;
        if (linkedHashMap == null) {
            eg.m("BundledEmojiListLoader.load is not called or complete");
            return null;
        }
        z6x z6xVar = (List) linkedHashMap.get(str);
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        return new p5x(str, z6xVar);
    }
}
