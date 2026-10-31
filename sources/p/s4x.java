package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.emoji2.emojipicker.EmojiView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s4x extends k9 {
    public static final j380 N0;
    public static final u280 Y = new u280(5, new int[]{2131955465, 2131955468, 2131955466, 2131955467, 2131955464});
    public static final u280 Z = new u280(5, new int[]{2132017534, 2132017537, 2132017535, 2132017536, 2132017533});
    public int X;
    public final Context c;
    public final View d;
    public final List e;
    public final LinearLayout f;
    public final p4x g;
    public final LayoutInflater h;
    public final LinearLayout i;
    public int t;

    static {
        h380 h380Var = new h380(4);
        h380Var.e("🤝", u280.c(2131233170, 2131233169));
        h380Var.e("👭", u280.c(2131233181, 2131233180));
        h380Var.e("👫", u280.c(2131233179, 2131233178));
        h380Var.e("👬", u280.c(2131233175, 2131233174));
        h380Var.e("🧑\u200d🤝\u200d🧑", u280.c(2131233177, 2131233176));
        h380Var.e("💏", u280.c(2131233448, 2131233447));
        h380Var.e("👩\u200d❤️\u200d💋\u200d👨", u280.c(2131233450, 2131233449));
        h380Var.e("👨\u200d❤️\u200d💋\u200d👨", u280.c(2131233446, 2131233445));
        h380Var.e("👩\u200d❤️\u200d💋\u200d👩", u280.c(2131233452, 2131233451));
        h380Var.e("💑", u280.c(2131231268, 2131231267));
        h380Var.e("👩\u200d❤️\u200d👨", u280.c(2131231270, 2131231269));
        h380Var.e("👨\u200d❤️\u200d👨", u280.c(2131231266, 2131231265));
        h380Var.e("👩\u200d❤️\u200d👩", u280.c(2131231272, 2131231271));
        N0 = h380Var.b(true);
    }

    public s4x(Context context, View view, List list, LinearLayout linearLayout, p4x p4xVar, String str) {
        super((byte) 6);
        this.c = context;
        this.d = view;
        this.e = list;
        this.f = linearLayout;
        this.g = p4xVar;
        this.h = LayoutInflater.from(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.i = linearLayout2;
        this.t = -1;
        this.X = -1;
        int iIndexOf = list.indexOf(str);
        if (iIndexOf > 0) {
            int i = (iIndexOf - 1) / 5;
            this.t = i;
            this.X = (iIndexOf - (i * 5)) - 1;
        }
    }

    @Override // p.k9
    public final Context O0() {
        return this.c;
    }

    @Override // p.k9
    public final View.OnClickListener Q0() {
        return this.g;
    }

    @Override // p.k9
    public final int S0() {
        return 5;
    }

    @Override // p.k9
    public final LinearLayout W0() {
        return this.f;
    }

    @Override // p.k9
    public final View X0() {
        return this.d;
    }

    @Override // p.k9
    public final List c1() {
        return this.e;
    }

    @Override // p.k9
    public final void u0() {
        LayoutInflater layoutInflater = this.h;
        LinearLayout linearLayout = this.i;
        layoutInflater.inflate(2131624563, linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(0);
        EmojiView emojiView = (EmojiView) linearLayout2.findViewById(2131428611);
        emojiView.setWillDrawVariantIndicator$emoji2_emojipicker_release(false);
        emojiView.setEmoji((CharSequence) this.e.get(0));
        View view = this.d;
        emojiView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
        emojiView.setClickable(true);
        emojiView.setOnClickListener(this.g);
        ((LinearLayout) linearLayout2.findViewById(2131428612)).setLayoutParams(new LinearLayout.LayoutParams((view.getWidth() * 5) / 2, view.getHeight()));
        x1();
        this.f.addView(linearLayout);
    }

    public final void v1(int i, int i2, boolean z) {
        ImageView imageView = (ImageView) this.h.inflate(2131624564, this.i).findViewById(2131428613);
        int i3 = 0;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(0, this.d.getHeight(), 1.0f));
        imageView.setImageDrawable(w1(imageView.getContext(), i, i2));
        if (z) {
            imageView.setImageTintList(ColorStateList.valueOf(-7829368));
        }
        int i4 = this.t;
        int i5 = this.X;
        if (i4 == -1) {
            i3 = i5 != -1 ? 1 : i4;
            i4 = i5;
        }
        Context context = imageView.getContext();
        u280 u280Var = Y;
        int iB = 2131955469;
        String string = context.getString((i4 != -1 && i3 == 0) ? u280Var.b(i4) : 2131955469);
        if (i4 != -1 && i3 != 0) {
            iB = u280Var.b(i4);
        }
        imageView.setContentDescription(context.getString(2131955470, string, context.getString(iB)));
    }

    @Override // p.k9
    public final void w0() {
        int i;
        final int i2 = 0;
        while (i2 < 2) {
            final LinearLayout linearLayout = new LinearLayout(this.c);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            final int i3 = 0;
            while (i3 < 5) {
                this.h.inflate(2131624564, linearLayout);
                final ImageView imageView = (ImageView) linearLayout.getChildAt(i3);
                View view = this.d;
                imageView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
                imageView.setClickable(true);
                Context context = imageView.getContext();
                u280 u280Var = Y;
                int iB = 2131955469;
                String string = context.getString((i3 != -1 && i2 == 0) ? u280Var.b(i3) : 2131955469);
                if (i3 != -1 && i2 != 0) {
                    iB = u280Var.b(i3);
                }
                imageView.setContentDescription(context.getString(2131955470, string, context.getString(iB)));
                int i4 = this.t;
                if ((i4 != -1 && i2 == 0 && i4 == i3) || ((i = this.X) != -1 && i2 == 1 && i == i3)) {
                    imageView.setSelected(true);
                    imageView.setClickable(false);
                }
                imageView.setImageDrawable(this.w1(imageView.getContext(), i2, i3));
                final s4x s4xVar = this;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: p.r4x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        View childAt;
                        int i5 = i2;
                        s4x s4xVar2 = s4xVar;
                        LinearLayout linearLayout2 = linearLayout;
                        int i6 = i3;
                        if (i5 == 0) {
                            int i7 = s4xVar2.t;
                            childAt = i7 != -1 ? linearLayout2.getChildAt(i7) : null;
                            s4xVar2.t = i6;
                        } else {
                            int i8 = s4xVar2.X;
                            childAt = i8 != -1 ? linearLayout2.getChildAt(i8) : null;
                            s4xVar2.X = i6;
                        }
                        if (childAt != null) {
                            childAt.setSelected(false);
                            childAt.setClickable(true);
                        }
                        ImageView imageView2 = imageView;
                        imageView2.setClickable(false);
                        imageView2.setSelected(true);
                        s4xVar2.x1();
                    }
                });
                i3++;
            }
            s4x s4xVar2 = this;
            s4xVar2.f.addView(linearLayout);
            i2++;
            this = s4xVar2;
        }
    }

    public final Drawable w1(Context context, int i, int i2) {
        u280 u280Var = (u280) N0.get(this.e.get(0));
        if (u280Var == null) {
            return null;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, Z.b(i2));
        Resources resources = context.getResources();
        int iB = u280Var.b(i);
        Resources.Theme theme = contextThemeWrapper.getTheme();
        ThreadLocal threadLocal = qx21.a;
        return resources.getDrawable(iB, theme);
    }

    public final void x1() {
        LinearLayout linearLayout = this.i;
        int childCount = linearLayout.getChildCount();
        if (childCount < 1 || childCount > 2) {
            return;
        }
        if (childCount == 2) {
            linearLayout.removeViewAt(1);
        }
        int i = this.t;
        if (i == -1 || this.X == -1) {
            if (i != -1) {
                v1(0, i, false);
                return;
            }
            int i2 = this.X;
            if (i2 != -1) {
                v1(1, i2, false);
                return;
            } else {
                v1(0, 0, true);
                return;
            }
        }
        this.h.inflate(2131624563, linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(1);
        EmojiView emojiView = (EmojiView) linearLayout2.findViewById(2131428611);
        emojiView.setWillDrawVariantIndicator$emoji2_emojipicker_release(false);
        emojiView.setClickable(true);
        emojiView.setEmoji((CharSequence) this.e.get((this.t * 5) + this.X + 1));
        emojiView.setOnClickListener(this.g);
        View view = this.d;
        emojiView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
        ((LinearLayout) linearLayout2.findViewById(2131428612)).setLayoutParams(new LinearLayout.LayoutParams((view.getWidth() * 5) / 2, view.getHeight()));
    }
}
