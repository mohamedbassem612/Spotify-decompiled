package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class gu5 extends cv5 {
    public static final fu5 Companion = new fu5();
    public static final znb0[] m = {null, dm5.S(2, ng5.h), null, null, null, null, null, null, null, null, null};
    public final aq5 b;
    public final List c;
    public final up5 d;
    public final Boolean e;
    public final Long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Boolean k;
    public final Boolean l;

    public gu5(int i, aq5 aq5Var, List list, up5 up5Var, Boolean bool, Long l, String str, String str2, String str3, String str4, Boolean bool2, Boolean bool3) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = aq5Var;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = up5Var;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 256) == 0) {
            this.j = null;
        } else {
            this.j = str4;
        }
        if ((i & 512) == 0) {
            this.k = null;
        } else {
            this.k = bool2;
        }
        if ((i & 1024) == 0) {
            this.l = null;
        } else {
            this.l = bool3;
        }
    }

    public gu5(aq5 aq5Var, ArrayList arrayList, up5 up5Var, Boolean bool, Long l, String str, String str2, String str3, String str4, Boolean bool2, Boolean bool3) {
        this.b = aq5Var;
        this.c = arrayList;
        this.d = up5Var;
        this.e = bool;
        this.f = l;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = bool2;
        this.l = bool3;
    }
}
