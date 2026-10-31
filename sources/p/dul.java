package p;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dul implements cul, eul {
    public final /* synthetic */ byte a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public dul(dul dulVar) {
        ClipData clipData = dulVar.b;
        clipData.getClass();
        this.b = clipData;
        int i = dulVar.c;
        o0c.n(i, 0, 5, "source");
        this.c = i;
        int i2 = dulVar.d;
        if ((i2 & 1) != i2) {
            jah.j("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.d = i2;
        this.e = dulVar.e;
        this.f = dulVar.f;
    }

    public void a(Uri uri) {
        this.e = uri;
    }

    public Uri b() {
        return this.e;
    }

    public ful build() {
        return new ful(new dul(this));
    }

    public void c(ClipData clipData) {
        this.b = clipData;
    }

    public ContentInfo d() {
        return null;
    }

    public ClipData e() {
        return this.b;
    }

    public Bundle getExtras() {
        return this.f;
    }

    public int getFlags() {
        return this.d;
    }

    public int getSource() {
        return this.c;
    }

    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public void setFlags(int i) {
        this.d = i;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return l1d.n(this.f != null ? ", hasExtras" : "", "}", sb);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ dul() {
    }
}
