package p;

import android.text.Editable;
import android.text.Html;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f170 implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (xMLReader == null || editable == null || !z || !u890.j(str, "ContentHandlerReplacementTag")) {
            return;
        }
        xMLReader.setContentHandler(new of5(xMLReader.getContentHandler(), editable));
    }
}
