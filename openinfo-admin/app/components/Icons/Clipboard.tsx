import React, { FC } from 'react';

import { IconProps } from 'types/common';

const Clipboard: FC<IconProps> = ({ size = 20, color = 'currentColor' }) => {
  return (
    <svg fill={color} width={size} height={size} viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
      <path d="M8 3a1 1 0 011-1h2a1 1 0 110 2H9a1 1 0 01-1-1z" />
      <path d="M6 3a2 2 0 00-2 2v11a2 2 0 002 2h8a2 2 0 002-2V5a2 2 0 00-2-2 3 3 0 01-3 3H9a3 3 0 01-3-3z" />
    </svg>
  );
};

export default Clipboard;
