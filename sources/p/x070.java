package p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x070 extends s5 {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern b;
    public final w070 a = new w070();
    public boolean c = false;
    public sw9 d = new sw9((byte) 1);

    public x070(Pattern pattern) {
        this.b = pattern;
    }

    @Override // p.s5
    public final void a(ala1 ala1Var) {
        sw9 sw9Var = this.d;
        CharSequence charSequence = ala1Var.a;
        StringBuilder sb = (StringBuilder) sw9Var.c;
        if (sw9Var.b != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        sw9Var.b++;
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.c = true;
    }

    @Override // p.s5
    public final void e() {
        this.a.g = ((StringBuilder) this.d.c).toString();
        this.d = null;
    }

    @Override // p.s5
    public final e6b f() {
        return this.a;
    }

    @Override // p.s5
    public final jwg j(cqu cquVar) {
        if (this.c) {
            return null;
        }
        if (cquVar.i && this.b == null) {
            return null;
        }
        return jwg.a(cquVar.c);
    }
}
