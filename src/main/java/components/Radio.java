package components;

import components.Component;

public class Radio extends Component {

    public Radio(Make make, Model model) {
        super(make, model);
    }


    public String tune() {
        return "I am tuned";
    }
}
