package com.spotify.legacyglue.pasteview;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.view.ViewGroup;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class PasteViewLayoutParamHelper {
    private PasteViewLayoutParamHelper() {
    }

    public static ViewGroup.LayoutParams generateMatchParentLayoutParams(Context context, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        XmlResourceParser layout = context.getResources().getLayout(2131625364);
        do {
            try {
            } catch (Exception e) {
                eg.f(e);
                return null;
            }
        } while (layout.nextToken() != 2);
        return viewGroup.generateLayoutParams(layout);
    }

    public static ViewGroup.LayoutParams generateMatchParentWidthAndHeightLayoutParams(Context context, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        XmlResourceParser layout = context.getResources().getLayout(2131625365);
        do {
            try {
            } catch (Exception e) {
                eg.f(e);
                return null;
            }
        } while (layout.nextToken() != 2);
        return viewGroup.generateLayoutParams(layout);
    }

    public static ViewGroup.LayoutParams generateWrapContentLayoutParams(Context context, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        XmlResourceParser layout = context.getResources().getLayout(2131625366);
        do {
            try {
            } catch (Exception e) {
                eg.f(e);
                return null;
            }
        } while (layout.nextToken() != 2);
        return viewGroup.generateLayoutParams(layout);
    }
}
