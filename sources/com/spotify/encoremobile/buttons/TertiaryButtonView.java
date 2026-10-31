package com.spotify.encoremobile.buttons;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.tyd1;
import p.w20;
import p.x74;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@adt
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00068\u0010X\u0090D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00068\u0010X\u0090D¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/spotify/encoremobile/buttons/TertiaryButtonView;", "Lp/w20;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lp/tyd1;", "textColor", "Lp/rih1;", "setTextColor", "(Lp/tyd1;)V", "t", "I", "getBtnTintList$src_main_java_com_spotify_encoremobile_buttons_buttons", "()I", "btnTintList", "N0", "getActionButtonBackground$src_main_java_com_spotify_encoremobile_buttons_buttons", "actionButtonBackground", "O0", "getTextColorAttr$src_main_java_com_spotify_encoremobile_buttons_buttons", "textColorAttr", "P0", "getTextTintList$src_main_java_com_spotify_encoremobile_buttons_buttons", "textTintList", "src_main_java_com_spotify_encoremobile_buttons-buttons"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TertiaryButtonView extends w20 {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public final int actionButtonBackground;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public final int textColorAttr;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public final int textTintList;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int btnTintList;

    public TertiaryButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.btnTintList = -1;
        this.actionButtonBackground = 2131233969;
        this.textColorAttr = -1;
        this.textTintList = 2131101389;
        j();
    }

    @Override // p.w20
    /* JADX INFO: renamed from: getActionButtonBackground$src_main_java_com_spotify_encoremobile_buttons_buttons, reason: from getter */
    public int getActionButtonBackground() {
        return this.actionButtonBackground;
    }

    @Override // p.w20
    /* JADX INFO: renamed from: getBtnTintList$src_main_java_com_spotify_encoremobile_buttons_buttons, reason: from getter */
    public int getBtnTintList() {
        return this.btnTintList;
    }

    @Override // p.w20
    /* JADX INFO: renamed from: getTextColorAttr$src_main_java_com_spotify_encoremobile_buttons_buttons, reason: from getter */
    public int getTextColorAttr() {
        return this.textColorAttr;
    }

    @Override // p.w20
    /* JADX INFO: renamed from: getTextTintList$src_main_java_com_spotify_encoremobile_buttons_buttons, reason: from getter */
    public int getTextTintList() {
        return this.textTintList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextColor(tyd1 textColor) {
        int textTintList;
        Context context = getContext();
        int iOrdinal = textColor.ordinal();
        if (iOrdinal != 1) {
            textTintList = iOrdinal != 2 ? getTextTintList() : 2131101388;
        } else {
            textTintList = 2131101390;
        }
        setTextColor(x74.E(context, textTintList));
    }

    public TertiaryButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public TertiaryButtonView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public TertiaryButtonView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ TertiaryButtonView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 2132017153 : i2);
    }
}
